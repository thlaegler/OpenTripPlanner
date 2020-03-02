package org.opentripplanner.routing.impl;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;
import static org.opentripplanner.routing.core.Fare.FareType.regular;
import java.util.Collection;
import java.util.Currency;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.routing.core.Fare;
import org.opentripplanner.routing.core.Fare.FareType;
import org.opentripplanner.routing.core.FareComponent;
import org.opentripplanner.routing.core.FareRuleSet;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AucklandTransportFareServiceImpl extends DefaultFareServiceImpl {

  private static final long serialVersionUID = 2L;

  private static final String CASH = "CASH";
  private static final String CARD = "CARD";
  private static final String FERRY = "FERRY";
  private static final String SKYBUS = "SKYBUS";
  private static final String CITY = "CITY";
  private static final String CITY_LINK = "CITY_LINK";
  private static final String NORTH = "NORTH";
  private static final String ZONES = "%s_ZONE";

  /**
   * This is called on runtime
   */
  @Override
  protected boolean populateFare(final Fare fare, final Currency currency, final FareType fareType,
      final List<Ride> rides, Collection<FareRuleSet> fareRuleSets) {
    log.trace("Populating Fares for {} using rides {}", fareType,
        rides.stream().map(r -> r.route.getId()).collect(joining(", ")));
    boolean hasPrice = false;

    AucklandTransportFareContainer fc =
        new AucklandTransportFareContainer(fare, currency, fareType, rides, fareRuleSets);

    // Apply this just to Auckland
    if (fc.getRideFeedIds().contains("at") || fc.getRideFeedIds().contains("metlink_wellington")) {

      // Route-based Fares (Ferry, SkyBus etc.)
      applyRouteFares(fc);

      // Zone-based Fares (Normal rides)
      applyZonedFares(fc);

      log.trace("Total Fare for {}", fareType);
      if (fc.getPrice() > 0) {
        hasPrice = true;
        fare.addFare(fareType, getMoney(currency, fc.getPrice()));
      } else {
        log.debug("No Fare for {}", rides);
      }
    }

    // Default fare-calculation for all other Providers
    if (fareType.equals(FareType.regular) || fc.getRideFeedIds().stream().anyMatch(
        rfi -> !rfi.equalsIgnoreCase("at") && !rfi.equalsIgnoreCase("metlink_wellington"))) {
      hasPrice = hasPrice || super.populateFare(fare, currency, fareType, rides, fareRuleSets);
    }

    return hasPrice;
  }

  private void applyZonedFares(AucklandTransportFareContainer fc) {
    log.trace("Applying zoned Card fares", fc.getFareType());

    if (!fc.getZonedRides().isEmpty() && !fc.getZonedZones().isEmpty()) {

      // Cash
      fc.getZonedRides().forEach(zr -> {
        String key = String.format(ZONES, zr.zones.size());
        FareRuleSet cash =
            getFareRuleSet(fc.getZoneFareRuleSets(), zr.route.getId(), false, key, CASH);
        calcPrice(fc, cash, CASH, key);
      });

      // Card
      log.trace("Journey of type {} through {} zones: {}", fc.getFareType());
      String key = String.format(ZONES, fc.getZonedZones().size());
      fc.getZonedRides().stream().findFirst().ifPresent(r -> {
        FareRuleSet hopCard =
            getFareRuleSet(fc.getZoneFareRuleSets(), r.route.getId(), false, key, CARD);
        calcPrice(fc, hopCard, CARD, key);
      });
    }
  }

  private void applyRouteFares(AucklandTransportFareContainer fc) {
    fc.getExcludedRides().forEach(zr -> {
      List<FareRuleSet> fareRuleSets = fc.getFareRuleSets().stream()
          .filter(frs -> frs.getRoutes().stream()
              .anyMatch(f -> f.getId().equalsIgnoreCase(zr.route.getId())))
          .collect(Collectors.toList());
      boolean hasFerryLeg = fareRuleSets.stream()
          .anyMatch(frs -> frs.getFareAttribute().getId().getId().contains(FERRY));
      boolean hasSkybusLeg = fareRuleSets.stream()
          .anyMatch(frs -> frs.getFareAttribute().getId().getId().contains(SKYBUS));
      boolean hasSpecialRouteLeg = fareRuleSets.stream()
          .anyMatch(frs -> frs.getFareAttribute().getId().getId().contains(CITY_LINK));

      boolean isSkybusNorth =
          fc.getRides().stream().anyMatch(r -> zr.zones.contains("lower_north_shore"));

      // Special Logic for Ferries
      if (hasFerryLeg) {
        FareRuleSet ferryCash = getFareRuleSet(fareRuleSets, zr.route.getId(), true, FERRY, CASH);
        FareRuleSet ferryCard = getFareRuleSet(fareRuleSets, zr.route.getId(), true, FERRY, CARD);
        calcPrice(fc, ferryCash, ferryCard, FERRY);
      }

      // Special Logic for SkyBus
      if (hasSkybusLeg) {
        if (isSkybusNorth) {
          FareRuleSet skyBusCashNorth =
              getFareRuleSet(fareRuleSets, zr.route.getId(), true, SKYBUS, NORTH, CASH);
          FareRuleSet skyBusCardNorth =
              getFareRuleSet(fareRuleSets, zr.route.getId(), true, SKYBUS, NORTH, CARD);
          calcPrice(fc, skyBusCashNorth, skyBusCardNorth, SKYBUS);
        } else {
          FareRuleSet skyBusCashCity =
              getFareRuleSet(fareRuleSets, zr.route.getId(), true, SKYBUS, CITY, CASH);
          FareRuleSet skyBusCardCity =
              getFareRuleSet(fareRuleSets, zr.route.getId(), true, SKYBUS, CITY, CARD);
          calcPrice(fc, skyBusCashCity, skyBusCardCity, SKYBUS);
        }
      }

      // Special Logic for inner city route CTY
      // if (hasSpecialRouteLeg) {
      // FareRuleSet specialRouteCash =
      // getSpecialRouteFareRuleSet(fareRuleSets, zr.route.getAgencyId(), CITY_LINK, CASH);
      // FareRuleSet specialRouteCard =
      // getSpecialRouteFareRuleSet(fareRuleSets, zr.route.getAgencyId(), CITY_LINK, CARD);
      // calcPrice(fc, specialRouteCash, specialRouteCard, CITY_LINK);
      // }
    });
  }

  private void calcPrice(AucklandTransportFareContainer fc, FareRuleSet fareRule, String payment,
      String label) {
    FeedScopedId fareId = null;
    Float price = null;

    if (fc.getFareType().name().toUpperCase().contains(payment) && fareRule != null) {
      fareId = fareRule.getFareAttribute().getId();
      price = getPassengerSpecificPrice(fareRule, fc.getFareType());
    }

    if (price != null && fareId != null) {
      fc.addPrice(price);
      FareComponent detail = new FareComponent(fareId, getMoney(fc.getCurrency(), price));
      detail.addRoute(fareId);
      detail.addRoute(new FeedScopedId(fareId.getId(), label));
      // detail.addRoute(
      // new FeedScopedId(fareId.getAgencyId(), zones.stream().collect(Collectors.joining(", "))));
      fc.getFare().getDetails(fc.getFareType()).add(detail);
    }
  }

  private float calcPrice(AucklandTransportFareContainer fc, FareRuleSet cashRule,
      FareRuleSet hopCardRule, String label) {
    FeedScopedId fareId = null;
    Float price = null;

    // Cash is different because each trip needs to be paid separately
    if ((fc.getFareType().name().toUpperCase().contains(CASH) || fc.getFareType().equals(regular))
        && cashRule != null) {
      fareId = cashRule.getFareAttribute().getId();
      price = getPassengerSpecificPrice(cashRule, fc.getFareType());
    } else if (fc.getFareType().name().toUpperCase().contains(CARD) && hopCardRule != null) {
      fareId = hopCardRule.getFareAttribute().getId();
      price = getPassengerSpecificPrice(hopCardRule, fc.getFareType());
    }

    if (price != null && fareId != null) {
      fc.addPrice(price);
      FareComponent detail = new FareComponent(fareId, getMoney(fc.getCurrency(), price));
      detail.addRoute(fareId);
      detail.addRoute(new FeedScopedId(fareId.getId(), label));
      fc.getFare().getDetails(fc.getFareType()).add(detail);
      return price;
    }
    return 0;
  }

  private FareRuleSet getFareRuleSet(Collection<FareRuleSet> fareRuleSets, String providerId,
      boolean isRouteRule, String... strings) {
    return fareRuleSets.stream().filter(Objects::nonNull)
        .filter(frs -> frs.getFareAttribute().getId().getId().equalsIgnoreCase(providerId)
            && asList(strings).stream()
                .allMatch(s -> frs.getFareAttribute().getId().getId().contains(s))
            && ((isRouteRule && frs.getRouteShortNames().stream()
                .anyMatch(shortName -> frs.getFareAttribute().getId().getId().contains(shortName)))
                || !isRouteRule))
        .findFirst().orElse(null);
  }

  private FareRuleSet getSpecialRouteFareRuleSet(Collection<FareRuleSet> fareRuleSets,
      String providerId, String... strings) {
    return fareRuleSets.stream().filter(Objects::nonNull)
        .filter(frs -> frs.getFareAttribute().getId().getId().equalsIgnoreCase(providerId)
            && asList(strings).stream()
                .allMatch(s -> frs.getFareAttribute().getId().getId().contains(s)))
        .findFirst().orElse(null);
  }

  private float getPassengerSpecificPrice(FareRuleSet fareRuleSet, FareType fareType) {
    switch (fareType) {
      case regular:
      case CASH_ADULT:
        return fareRuleSet.getFareAttribute().getAdultCashPrice() != 0
            ? fareRuleSet.getFareAttribute().getAdultCashPrice()
            : fareRuleSet.getFareAttribute().getPrice();
      case child:
      case youth:
      case CASH_CHILD:
        return fareRuleSet.getFareAttribute().getChildCashPrice() != 0
            ? fareRuleSet.getFareAttribute().getChildCashPrice()
            : fareRuleSet.getFareAttribute().getPrice();
      case senior:
      case student:
      case special:
      case CASH_TERTIARY:
        return fareRuleSet.getFareAttribute().getTertiaryCashPrice() != 0
            ? fareRuleSet.getFareAttribute().getTertiaryCashPrice()
            : fareRuleSet.getFareAttribute().getPrice();
      case CARD_ADULT:
        return fareRuleSet.getFareAttribute().getAdultCardPrice() != 0
            ? fareRuleSet.getFareAttribute().getAdultCardPrice()
            : fareRuleSet.getFareAttribute().getPrice();
      case CARD_CHILD:
        return fareRuleSet.getFareAttribute().getChildCardPrice() != 0
            ? fareRuleSet.getFareAttribute().getChildCardPrice()
            : fareRuleSet.getFareAttribute().getPrice();
      case CARD_TERTIARY:
        return fareRuleSet.getFareAttribute().getTertiaryCardPrice() != 0
            ? fareRuleSet.getFareAttribute().getTertiaryCardPrice()
            : fareRuleSet.getFareAttribute().getPrice();
      default:
        log.debug("Unknown fare type {}", fareType);
        return fareRuleSet.getFareAttribute().getPrice();
    }
  }

}
