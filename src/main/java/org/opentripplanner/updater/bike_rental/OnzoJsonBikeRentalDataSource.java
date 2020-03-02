package org.opentripplanner.updater.bike_rental;

import java.util.HashSet;
import org.opentripplanner.routing.bike_rental.BikeRentalStation;
import org.opentripplanner.util.NonLocalizedString;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Onzo bike rental data source (free-floating). URL:
 * https://app.onzo.co.nz/nearby/-36.844899/174.757550/2000.0
 */
public class OnzoJsonBikeRentalDataSource extends GenericJsonBikeRentalDataSource {

  private String networkName;

  public OnzoJsonBikeRentalDataSource(String networkName) {
    super("data");

    if (networkName != null && !networkName.isEmpty()) {
      this.networkName = networkName;
    } else {
      this.networkName = "Onzo";
    }
  }

  // @formatter:off
  /**
   * {
   * "code":"0000",
   * "data":[
   *     {
   *         "battery":100,
   *         "chargeVoltage":609,
   *         "createTime":1509033600000,
   *         "direction":101,
   *         "height":0,
   *         "iccid":"89860117750007950877",
   *         "id":51,
   *         "isLock":0,
   *         "isScooter":0,
   *         "latitude":-36.84406,
   *         "locationMode":13,
   *         "lockType":2,
   *         "longitude":174.863668,
   *         "lstatus":0,
   *         "mac":"d593b844d21f",
   *         "modelNum":"0000000000000000000000000000000000000000",
   *         "producid":"585124259915",
   *         "psignal":15,
   *         "pstatus":3932166,
   *         "speed":41,
   *         "unlockedTimes":101,
   *         "updateTime":1561007861000,
   *         "voltage":419
   *     }
   *   ]
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

    brstation.id = rentalStationNode.path("iccid").asText("").trim();
    brstation.name = new NonLocalizedString("Onzo " + rentalStationNode.path("id"));
    brstation.x = rentalStationNode.path("longitude").asDouble();
    brstation.y = rentalStationNode.path("latitude").asDouble();
    brstation.spacesAvailable = rentalStationNode.path("empty_slots").asInt(1);
    brstation.bikesAvailable = rentalStationNode.path("free_bikes").asInt(1);
    brstation.realTimeData = true;
    brstation.isFloatingBike = true;
    brstation.allowDropoff = true;

    // brstation.bearing = rentalStationNode.path("direction").asInt(0);
    // brstation.battery = rentalStationNode.path("battery").asInt(100);

    return brstation;
  }
}
