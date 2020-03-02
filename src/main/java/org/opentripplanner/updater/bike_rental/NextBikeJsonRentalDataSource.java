package org.opentripplanner.updater.bike_rental;

import java.util.HashSet;
import org.opentripplanner.routing.bike_rental.BikeRentalStation;
import org.opentripplanner.util.NonLocalizedString;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * NextBike bike rental data source (stations). URL:
 * http://api.citybik.es/v2/networks/nextbike-auckland
 */
public class NextBikeJsonRentalDataSource extends GenericJsonBikeRentalDataSource {

  private String networkName;

  public NextBikeJsonRentalDataSource(String networkName) {
    super("network/stations");

    if (networkName != null && !networkName.isEmpty()) {
      this.networkName = networkName;
    } else {
      this.networkName = "NextBike";
    }
  }

  // @formatter:off
  /**
   * {
   * "network": {
   *     "company": [
   *         "Nextbike GmbH"
   *    ],
   *     "href": "/v2/networks/nextbike-auckland",
   *     "id": "nextbike-auckland",
   *     "location": {
   *        "city": "Auckland",
   *        "country": "NZ",
   *        "latitude": -36.8603,
   *        "longitude": 174.763
   *    },
   *    "name": "Nextbike",
   *    "stations": [
   *        {
   *            "empty_slots": 2,
   *            "extra": {
   *                "bike_uids": [
   *                    "64103",
   *                    "64102"
   *                ],
   *                "number": "7776",
   *                "slots": 4,
   *               "uid": "213693"
   *            },
   *            "free_bikes": 2,
   *            "id": "d65e5d3ab8a83d23425081efc9269315",
   *            "latitude": -36.7902471750808,
   *            "longitude": 174.660859107971,
   *            "name": "1 Hastings st",
   *            "timestamp": "2019-06-19T22:00:43.223000Z"
   *        },
   *    ]
   *  }
   * }
   */
  //@formatter:on
  @Override
  public BikeRentalStation makeStation(JsonNode rentalStationNode) {
    // some place entries appear to actually be checked-out bikes, not stations
    if (rentalStationNode == null) {
      return null;
    }

    BikeRentalStation brstation = new BikeRentalStation();

    brstation.networks = new HashSet<String>();
    brstation.networks.add(this.networkName);

    brstation.id = rentalStationNode.path("id").asText("").trim();
    brstation.name = new NonLocalizedString(rentalStationNode.path("name").asText("").trim());
    brstation.x = rentalStationNode.path("longitude").asDouble();
    brstation.y = rentalStationNode.path("latitude").asDouble();
    brstation.spacesAvailable = rentalStationNode.path("empty_slots").asInt(0);
    brstation.bikesAvailable = rentalStationNode.path("free_bikes").asInt(0);
    brstation.isFloatingBike = false;
    brstation.realTimeData = true;
    brstation.allowDropoff = true;

    return brstation;
  }
}
