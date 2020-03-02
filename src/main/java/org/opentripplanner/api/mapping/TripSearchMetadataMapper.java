package org.opentripplanner.api.mapping;

import org.opentripplanner.api.model.ApiTripSearchMetadata;
import org.opentripplanner.model.routing.TripSearchMetadata;

public class TripSearchMetadataMapper {

  public static ApiTripSearchMetadata mapTripSearchMetadata(TripSearchMetadata domain) {
    ApiTripSearchMetadata api = new ApiTripSearchMetadata();
    if (domain.searchWindowUsed != null) {
      api.searchWindowUsed = (int) domain.searchWindowUsed.toSeconds();
    }
    if (domain.nextDateTime != null) {
      api.nextDateTime = domain.nextDateTime.toEpochMilli();
    }
    if (domain.prevDateTime != null) {
      api.prevDateTime = domain.prevDateTime.toEpochMilli();
    }
    return api;
  }
}
