package org.opentripplanner.routing.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.opentripplanner.model.FareAttribute;
import org.opentripplanner.model.FareRule;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.model.OtpTransitService;
import org.opentripplanner.model.Route;
import org.opentripplanner.routing.core.Fare.FareType;
import org.opentripplanner.routing.core.FareRuleSet;
import org.opentripplanner.routing.services.FareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AucklandTransportFareServiceFactory extends DefaultFareServiceFactory {

  @SuppressWarnings("unused")
  private static final Logger LOG =
      LoggerFactory.getLogger(AucklandTransportFareServiceFactory.class);

  @Override
  public FareService makeFareService() {

    AucklandTransportFareServiceImpl fareService = new AucklandTransportFareServiceImpl();
    fareService.addFareRules(FareType.regular, regularFareRules.values());
    fareService.addFareRules(FareType.CASH_ADULT, regularFareRules.values());
    fareService.addFareRules(FareType.CARD_ADULT, regularFareRules.values());
    fareService.addFareRules(FareType.CASH_CHILD, regularFareRules.values());
    fareService.addFareRules(FareType.CARD_CHILD, regularFareRules.values());
    fareService.addFareRules(FareType.CASH_TERTIARY, regularFareRules.values());
    fareService.addFareRules(FareType.CARD_TERTIARY, regularFareRules.values());
    return fareService;
  }

  @Override
  public void configure(JsonNode config) {
    // No config for the moment
  }

  @Override
  public void processGtfs(OtpTransitService transitService) {
    // Add custom extension: trips may have a fare ID specified in KCM GTFS.
    // Need to ensure that we are scoped to feed when adding trips to FareRuleSet,
    // since fare IDs may not be unique across feeds and trip agency IDsqq
    // may not match fare attribute agency IDs (which are feed IDs).

    final Map<FeedScopedId, FareRuleSet> feedFareRules = new HashMap<>();
    fillFareRules(null, transitService.getAllFareAttributes(), transitService.getAllFareRules(),
        feedFareRules);

    regularFareRules.putAll(feedFareRules);

    final Map<String, FareRuleSet> feedFareRulesById = new HashMap<>();

    regularFareRules.values().forEach(rule -> {
      String id = rule.getFareAttribute().getId().getId();
      feedFareRulesById.put(id, rule);
    });

    transitService.getAllTrips().forEach(trip -> {
      String fareId = trip.getFareId();
      FareRuleSet rule = feedFareRulesById.get(fareId);
      if (rule != null)
        rule.addTrip(trip.getId());
    });
  }

  @Override
  protected void fillFareRules(String agencyId, Collection<FareAttribute> fareAttributes,
      Collection<FareRule> fareRules, Map<FeedScopedId, FareRuleSet> fareRuleSets) {

    if (fareAttributes.stream().anyMatch(fa -> fa.getId().getId().equalsIgnoreCase("at")
        || fa.getId().getId().contains("wellington"))) {
      // Create an empty FareRuleSet for each FareAttribute, as some FareAttribute may have no rules
      fareRules.stream().forEach(fareRule -> {
        fareAttributes.stream()
            .filter(fareAttr -> fareAttr.getId().getId()
                .equalsIgnoreCase(fareRule.getFare().getId().getId()))
            .findFirst().ifPresent(fareAttr -> {
              // FeedScopedId id = fareAttr.getId();
              FeedScopedId id = new FeedScopedId(fareAttr.getId().getId(),
                  String.format("%s %s %s %s", fareAttr.getId().getId(), fareRule.getRoute(),
                      fareRule.getOriginId(), fareRule.getDestinationId()));
              FareRuleSet fareRuleSet = fareRuleSets.get(id);

              if (fareRuleSet == null) {
                fareRuleSet = new FareRuleSet(fareAttr);
                fareRuleSets.put(id, fareRuleSet);
                if (agencyId != null) {
                  // TODO With the new GTFS lib, use fareAttribute.agency_id directly
                  fareRuleSet.setAgency(agencyId);
                }

                String contains = fareRule.getContainsId();
                if (contains != null) {
                  fareRuleSet.addContains(contains);
                }
                String origin = fareRule.getOriginId();
                String destination = fareRule.getDestinationId();
                if (origin != null || destination != null) {
                  fareRuleSet.addOriginDestination(origin, destination);
                }
                Route route = fareRule.getRoute();
                if (route != null) {
                  FeedScopedId routeId = route.getId();
                  fareRuleSet.addRoute(routeId);
                  fareRuleSet.addRouteShortName(route.getShortName());
                }
              }
            });
      });

      log.debug("Done with preparing fares for Auckland");
    } else {
      super.fillFareRules(agencyId, fareAttributes, fareRules, fareRuleSets);
    }
  }

}
