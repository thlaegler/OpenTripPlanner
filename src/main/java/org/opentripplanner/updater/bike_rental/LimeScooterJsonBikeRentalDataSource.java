package org.opentripplanner.updater.bike_rental;

import java.util.HashSet;
import org.opentripplanner.routing.bike_rental.BikeRentalStation;
import org.opentripplanner.util.NonLocalizedString;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Lime scooter rental data source (free floating). URL:
 * https://web-production.lime.bike/api/rider/v1/views/map?ne_lat=-45.5&ne_lng=170.9&sw_lat=-46.1&sw_lng=170.1&user_latitude=-45.869000&user_longitude=170.520953&zoom=16
 * Authorization-Header: Bearer
 * eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX3Rva2VuIjoiWVkyRkhRWlRWR0RIQiIsImxvZ2luX2NvdW50IjoyfQ.CnkadzFsmYPLOkTgb9VyHonUGaZtF5XJ2avPFx-YF_I
 * 
 * TODO: Where and how to fresh Bearer Token?
 */
public class LimeScooterJsonBikeRentalDataSource extends GenericJsonBikeRentalDataSource {

  private String networkName;

  public LimeScooterJsonBikeRentalDataSource(String networkName) {
    super("data/attributes/bikes", "Authorization",
        "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX3Rva2VuIjoiWVkyRkhRWlRWR0RIQiIsImxvZ2luX2NvdW50IjoyfQ.CnkadzFsmYPLOkTgb9VyHonUGaZtF5XJ2avPFx-YF_I");

    if (networkName != null && !networkName.isEmpty()) {
      this.networkName = networkName;
    } else {
      this.networkName = "Lime";
    }
  }

  // @formatter:off
  /**
   * {
   *    "data": {
   *        "id": "views::mapview",
   *        "type": "map_view",
   *        "attributes": {
   *            "bikes": [
   *                {
   *                    "id": "ET-2ZZ6IJEOX4JDSJQ4V2CGKUJ4WSAXUCLECVWAFKQ",
   *                    "type": "bikes",
   *                    "attributes": {
   *                        "status": "locked",
   *                        "plate_number": "XXX-810",
   *                        "latitude": -45.872945,
   *                        "longitude": 170.504789,
   *                        "last_activity_at": "2019-06-20T01:04:57.000Z",
   *                        "bike_icon": null,
   *                        "type_name": "scooter",
   *                        "battery_level": "high",
   *                        "meter_range": 21001,
   *                        "rate_plan": "NZD $1 to unlock +\nNZD $0.30 / 1 min",
   *                        "rate_plan_short": "<b><font color='#7AD319' size='16' face='Montserrat'>NZD $1</font></b><font color='#444A57' size='12' face='Montserrat'> unlock + </font><b><font color='#7AD319' size='16' face='Montserrat'>NZD $0.30 </font></b> <font color='#444A57' size='12' face='Montserrat'> / 1 min</font>",
   *                        "bike_icon_id": 6,
   *                        "last_three": "810",
   *                        "license_plate_number": null
   *                    }
   *                }
   *            ]
   *        }
   *    }
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
    brstation.name = new NonLocalizedString(
        "Lime " + rentalStationNode.path("attributes").path("plate_number").asText("").trim());
    brstation.x = rentalStationNode.path("attributes").path("longitude").asDouble();
    brstation.y = rentalStationNode.path("attributes").path("latitude").asDouble();
    brstation.spacesAvailable = rentalStationNode.path("attributes").path("empty_slots").asInt(1);
    brstation.bikesAvailable = rentalStationNode.path("attributes").path("free_bikes").asInt(1);
    brstation.realTimeData = true;
    brstation.isFloatingBike = true;
    brstation.allowDropoff = true;

    // brstation.battery = rentalStationNode.path("attributes").path("battery_level").asInt(100);

    return brstation;
  }
}
