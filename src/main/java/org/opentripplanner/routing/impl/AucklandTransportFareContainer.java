package org.opentripplanner.routing.impl;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.opentripplanner.routing.core.Fare;
import org.opentripplanner.routing.core.Fare.FareType;
import org.opentripplanner.routing.core.FareComponent;
import org.opentripplanner.routing.core.FareRuleSet;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AucklandTransportFareContainer {

  private float price = 0;

  private final FareType fareType;

  private final Currency currency;

  private final Collection<FareRuleSet> fareRuleSets;

  private final List<Ride> rides;

  private final Fare fare;

  private final List<String> rideFeedIds;

  private final List<String> rideRouteIds;

  private final List<String> rideZones;

  private final List<String> excludedRouteIds;

  // private final List<String> excludedZones;

  private final List<FareRuleSet> routeFareRuleSets;

  private final List<FareRuleSet> zoneFareRuleSets;

  private final List<String> zonedZones;

  private final List<String> zonedRouteIds;

  private final List<Ride> excludedRides;

  private final List<Ride> zonedRides;

  public AucklandTransportFareContainer(Fare fare, Currency currency, FareType fareType,
      final List<Ride> rides, Collection<FareRuleSet> fareRuleSets) {

    this.fare = fare;

    this.fareType = fareType;

    this.currency = currency;

    this.fareRuleSets = fareRuleSets;

    this.rides = rides;

    this.rideFeedIds = new ArrayList<>(new HashSet<>(
        rides.stream().map(ride -> ride.route.getId()).filter(Objects::nonNull).collect(toList())));

    this.rideRouteIds = new ArrayList<>(new HashSet<>(
        rides.stream().map(ride -> ride.route.getId()).filter(Objects::nonNull).collect(toList())));

    this.rideZones = new ArrayList<>(new HashSet<>(rides.stream().map(r -> {
      List<String> l = new ArrayList<>();
      l.addAll(r.zones.stream().filter(Objects::nonNull).collect(toSet()));
      l.add(r.startZone);
      l.add(r.endZone);
      return l;
    }).flatMap(Collection::stream).filter(Objects::nonNull).collect(toList())));

    this.routeFareRuleSets =
        fareRuleSets.stream().filter(frs -> frs.getRoutes() != null && !frs.getRoutes().isEmpty())
            .filter(Objects::nonNull).collect(toList());

    this.zoneFareRuleSets =
        fareRuleSets.stream().filter(frs -> (frs.getRoutes() == null || frs.getRoutes().isEmpty()))
            .filter(Objects::nonNull).collect(toList());

    this.excludedRouteIds = routeFareRuleSets.stream()
        .map(fr -> fr.getRoutes().stream().map(r -> r.getId()).collect(toList()))
        .flatMap(Collection::stream).filter(Objects::nonNull).collect(toList());

    this.excludedRides =
        rides.stream().filter(ri -> excludedRouteIds.contains(ri.route.getId())).collect(toList());

    this.zonedRouteIds = this.rideRouteIds.stream().filter(rz -> !excludedRouteIds.contains(rz))
        .filter(Objects::nonNull).collect(toList());

    this.zonedRides = rides.stream().filter(r -> zonedRouteIds.contains(r.route.getId())).map(r -> {
      r.zones = r.zones.stream().filter(Objects::nonNull).collect(toSet());
      return r;
    }).filter(Objects::nonNull).collect(toList());

    this.zonedZones = new ArrayList<>(new HashSet<>(zonedRides.stream().map(r -> {
      List<String> l = new ArrayList<>();
      l.addAll(r.zones.stream().filter(Objects::nonNull).collect(toSet()));
      l.add(r.startZone);
      l.add(r.endZone);
      return l;
    }).flatMap(Collection::stream).filter(Objects::nonNull).collect(toList())));

    if (fare.details == null || fare.details.isEmpty()) {
      fare.details = new HashMap<FareType, List<FareComponent>>();
      fare.addFareDetails(fareType, new ArrayList<FareComponent>());
    }
  }

  public void addPrice(float price) {
    this.price = this.price + price;
  }

}
