package org.opentripplanner.updater.stoptime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.opentripplanner.model.FeedScopedId;
import org.opentripplanner.routing.alertpatch.Alert;
import org.opentripplanner.routing.alertpatch.AlertPatch;
import org.opentripplanner.routing.alertpatch.TimePeriod;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.impl.AlertPatchServiceImpl;
import org.opentripplanner.routing.services.AlertPatchService;
import org.opentripplanner.updater.GraphUpdater;
import org.opentripplanner.updater.GraphUpdaterManager;
import org.opentripplanner.updater.GtfsRealtimeFuzzyTripMatcher;
import org.opentripplanner.util.I18NString;
import org.opentripplanner.util.TranslatedString;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.transit.realtime.GtfsRealtime;
import com.google.transit.realtime.GtfsRealtime.EntitySelector;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.TimeRange;
import com.google.transit.realtime.GtfsRealtime.TripDescriptor;
import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 *  {
 *    "type": "mobility23-kafka-gtfs-updater",
 *    "feedId": "at",
 *    "projectId": "mobility23",
 *    "url": "https://mobility23.firebaseio.com",
 *    "bucketName": "mobility23-gtfs",
 *    "subscriptionId": "mobility23-gtfs-static-update",
 *    "tripUpdateChannel": "gtfs/realtime/trip_updates",
 *    "alertChannel": "gtfs/realtime/alerts"
 *  }
 * </pre>
 */
@Slf4j
public class KafkaAlertGraphUpdater implements GraphUpdater {

  /**
   * Parent update manager. Is used to execute graph writer runnables.
   */
  private GraphUpdaterManager updaterManager;

  private AlertPatchService alertPatchService;

  /** How long before the posted start of an event it should be displayed to users */
  private long earlyStart;

  /** Set only if we should attempt to match the trip_id from other data in TripDescriptor */
  private GtfsRealtimeFuzzyTripMatcher fuzzyTripMatcher;

  /**
   * Base URL of Firebase
   */
  private String url;

  /**
   * The ID for the static feed to which these TripUpdates are applied
   */
  private String feedId;

  private String googleProjectId;

  private String alertTopic;

  private KafkaListener alertKafkaListener;

  private ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public void setGraphUpdaterManager(GraphUpdaterManager updaterManager) {
    this.updaterManager = updaterManager;
  }

  @Override
  public void configure(Graph graph, JsonNode config) throws Exception {
    String profile = System.getenv("OTP_PROFILE");
    if (profile != null && profile.equalsIgnoreCase("SERVER")) {
      this.url = config.path("url").asText();
      this.feedId = config.path("feedId").asText("");
      // this.alertPatchService = new AlertPatchServiceImpl(graph);
      this.earlyStart = config.path("earlyStartSec").asInt(0);
      this.feedId = config.path("feedId").asText();
      this.alertPatchService = new AlertPatchServiceImpl(graph);
      this.googleProjectId = config.path("projectId").asText();

      this.alertTopic = config.path("alertTopic").asText();
      alertKafkaListener = createListener();
      // Consumer<String, FeedEntity> tripUpdateConsumer = createConsumer(url, tripUpdateChannel);
      // tripUpdateConsumer.subscribe(Arrays.asList(tripUpdateChannel));
      //
      // while (true) {
      // ConsumerRecords<String, String> records = kafkaConsumer.poll(100);
      // for (ConsumerRecord<String, String> record : records) {
      // System.out.printf("offset = %d, value = %s", record.offset(), record.value());
      // System.out.println();
      // }
      // }
      // Consumer<String, FeedEntity> alertConsumer = createConsumer(url, alertTopic);

      // Kafka Topic Listeners
      // if (tripUpdateKafkaListener == null) {
      // tripUpdateKafkaListener = new KafkaListener(url, tripUpdateTopic) {
      // @Override
      // void handleFeedMessage(FeedEntity feed) {
      // handleFeedEntity(feed);
      // }
      // };
      // tripUpdateKafkaListener.run();
      // }

      // if (alertKafkaListener == null) {
      // alertKafkaListener = new KafkaListener(url, alertTopic) {
      // @Override
      // void handleFeedMessage(FeedEntity feed) {
      // handleFeedEntity(feed);
      // }
      // };
      // alertKafkaListener.run();
      // }
    }
  }

  private void handleFeedEntity(FeedEntity feed) {
    if (feed != null) {
      log.info("Incoming GTFS realtime feed from '{}' for provider '{}' {}", "PubSub",
          feed.getProviderId(), feed);
      String feedId1 = feed.hasProviderId() ? feed.getProviderId() : feedId;
      String tripId = feed.getTripUpdate().getTrip().getTripId();
      log.info("New GTFS realtime trip update for provider '{}' and trip {}", feedId1, tripId);
      if (feed.hasAlert()) {
        handleGtfsRealtimeAlertInternal(feed.getId(), feed);
      } else if (feed.hasTripUpdate()) {
        TripUpdateGraphWriterRunnable runnable =
            new TripUpdateGraphWriterRunnable(false, Arrays.asList(feed.getTripUpdate()), feedId1);
        updaterManager.execute(runnable);
      }
    }
  }


  /**
   * convert a protobuf TranslatedString to a OTP TranslatedString
   *
   * @return A TranslatedString containing the same information as the input
   */
  private I18NString deBuffer(GtfsRealtime.TranslatedString input) {
    Map<String, String> translations = new HashMap<>();
    for (GtfsRealtime.TranslatedString.Translation translation : input.getTranslationList()) {
      String language = translation.getLanguage();
      String string = translation.getText();
      translations.put(language, string);
    }
    return translations.isEmpty() ? null : TranslatedString.getI18NString(translations);
  }

  private void handleGtfsRealtimeAlertInternal(String id, FeedEntity feed) {
    String feedId = feed.hasProviderId() ? feed.getProviderId() : "at";
    String tripId = feed.getTripUpdate().getTrip().getTripId();
    log.trace("New GTFS realtime alert for provider '{}' and trip {}", feedId, tripId);

    com.google.transit.realtime.GtfsRealtime.Alert alert = feed.getAlert();
    Alert alertText = new Alert();
    alertText.alertDescriptionText = deBuffer(alert.getDescriptionText());
    alertText.alertHeaderText = deBuffer(alert.getHeaderText());
    alertText.alertUrl = deBuffer(alert.getUrl());
    ArrayList<TimePeriod> periods = new ArrayList<TimePeriod>();
    if (alert.getActivePeriodCount() > 0) {
      long bestStartTime = Long.MAX_VALUE;
      long lastEndTime = Long.MIN_VALUE;
      for (TimeRange activePeriod : alert.getActivePeriodList()) {
        final long realStart = activePeriod.hasStart() ? activePeriod.getStart() : 0;
        final long start = activePeriod.hasStart() ? realStart - earlyStart : 0;
        if (realStart > 0 && realStart < bestStartTime) {
          bestStartTime = realStart;
        }
        final long end = activePeriod.hasEnd() ? activePeriod.getEnd() : Long.MAX_VALUE;
        if (end > lastEndTime) {
          lastEndTime = end;
        }
        periods.add(new TimePeriod(start, end));
      }
      if (bestStartTime != Long.MAX_VALUE) {
        alertText.effectiveStartDate = new Date(bestStartTime * 1000);
      }
      if (lastEndTime != Long.MIN_VALUE) {
        alertText.effectiveEndDate = new Date(lastEndTime * 1000);
      }
    } else {
      // Per the GTFS-rt spec, if an alert has no TimeRanges, than it should always be shown.
      periods.add(new TimePeriod(0, Long.MAX_VALUE));
    }
    for (EntitySelector informed : alert.getInformedEntityList()) {
      if (fuzzyTripMatcher != null && informed.hasTrip()) {
        TripDescriptor trip = fuzzyTripMatcher.match(feedId, informed.getTrip());
        informed = informed.toBuilder().setTrip(trip).build();
      }
      String patchId = buildAlertId(id, informed);

      String routeId = null;
      if (informed.hasRouteId()) {
        routeId = informed.getRouteId();
      }

      int direction;
      if (informed.hasTrip() && informed.getTrip().hasDirectionId()) {
        direction = informed.getTrip().getDirectionId();
      } else {
        direction = -1;
      }

      if (informed.hasTrip() && informed.getTrip().hasTripId()) {
        tripId = informed.getTrip().getTripId();
      }
      String stopId = null;
      if (informed.hasStopId()) {
        stopId = informed.getStopId();
      }

      String agencyId = informed.getAgencyId();
      if (informed.hasAgencyId()) {
        agencyId = informed.getAgencyId().intern();
      }

      AlertPatch patch = new AlertPatch();
      patch.setFeedId(feedId);
      if (routeId != null) {
        patch.setRoute(new FeedScopedId(feedId, routeId));
        // Makes no sense to set direction if we don't have a route
        if (direction != -1) {
          patch.setDirectionId(direction);
        }
      }
      if (tripId != null) {
        patch.setTrip(new FeedScopedId(feedId, tripId));
      }
      if (stopId != null) {
        patch.setStop(new FeedScopedId(feedId, stopId));
      }
      if (agencyId != null && routeId == null && tripId == null && stopId == null) {
        patch.setAgencyId(agencyId);
      }
      patch.setTimePeriods(periods);
      patch.setAlert(alertText);

      patch.setId(patchId);

      alertPatchService.apply(patch);
    }
  }


  private String buildAlertId(String id, EntitySelector informed) {
    return id + " " + (informed.hasAgencyId() ? informed.getAgencyId() : " null ") + " "
        + (informed.hasRouteId() ? informed.getRouteId() : " null ") + " "
        + (informed.hasTrip() && informed.getTrip().hasDirectionId()
            ? informed.getTrip().hasDirectionId()
            : " null ")
        + " " + (informed.hasRouteType() ? informed.getRouteType() : " null ") + " "
        + (informed.hasStopId() ? informed.getStopId() : " null ") + " "
        + (informed.hasTrip() && informed.getTrip().hasTripId() ? informed.getTrip().getTripId()
            : " null ");
  }


  private void handleFeedEntity(String rawMessage) {
    if (rawMessage != null) {
      try {
        FeedEntity feed = objectMapper.readValue(rawMessage, new TypeReference<FeedEntity>() {});
        handleFeedEntity(feed);
      } catch (IOException ex) {
        log.error("Cannot parse GTFS realtime PubSub message, {}", rawMessage.toString(), ex);
      }
    } else {
      log.warn("PubSub Message is null/empty or not initialized", rawMessage);
    }
  }

  public void setFeedId(String feedId) {
    if (feedId != null)
      this.feedId = feedId.intern();
  }

  public long getEarlyStart() {
    return earlyStart;
  }

  public void setEarlyStart(long earlyStart) {
    this.earlyStart = earlyStart;
  }

  public void setFuzzyTripMatcher(GtfsRealtimeFuzzyTripMatcher fuzzyTripMatcher) {
    this.fuzzyTripMatcher = fuzzyTripMatcher;
  }

  private KafkaListener createListener() {
    return new KafkaListener(url, alertTopic) {
      @Override
      void handleFeedMessage(FeedEntity feed) {
        handleFeedEntity(feed);
      }
    };
  }

  @Override
  public void run() throws Exception {
    if (alertKafkaListener == null) {
      alertKafkaListener = createListener();
    } else {
      alertKafkaListener.stop();
    }
    alertKafkaListener.run();
  }

  @Override
  public void teardown() {
    alertKafkaListener.stop();
  }

  @Override
  public String getName() {
    return "mobility23-kafka-gtfs-updater";
  }

  @Override
  public void setup(Graph graph) throws Exception {
    // Only create a realtime data snapshot source if none exists already
    graph.getOrSetupTimetableSnapshotProvider(TimetableSnapshotSource::new);
  }

}
