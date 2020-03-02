package org.opentripplanner.updater.stoptime;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.connect.json.JsonDeserializer;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class KafkaListener {

  // private static final String KAFKA_SERVER_URL = "mobility23-kafka";
  // private static final String KAFKA_SERVER_PORT = "9092";
  private static final String CLIENT_ID = "OpenTripPlanner";
  // private static final String GROUP_ID = UUID.randomUUID();

  private KafkaConsumer<String, FeedEntity> consumer;

  public KafkaListener(String address, String topicName) {
    consumer = createConsumer(address, topicName);
  }

  private KafkaConsumer<String, FeedEntity> createConsumer(String address, String topicName) {
    Properties props = new Properties();
    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, address);
    props.put(ConsumerConfig.CLIENT_ID_CONFIG, CLIENT_ID);// + "_" + topicName);
    props.put(ConsumerConfig.GROUP_ID_CONFIG, CLIENT_ID);// "group_" + UUID.randomUUID());
    props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
    // props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
    props.put(ConsumerConfig.ALLOW_AUTO_CREATE_TOPICS_CONFIG, true);
    // props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
    // props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "30000");
    props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    // "org.apache.kafka.common.serialization.StringDeserializer");
    props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
    // "org.apache.kafka.common.serialization.StringDeserializer");

    KafkaConsumer<String, FeedEntity> consumer = new KafkaConsumer<>(props);

    consumer.subscribe(Collections.singletonList(topicName));

    return consumer;
  }

  void stop() {
    consumer.unsubscribe();
  }

  void run() throws InterruptedException {
    final int giveUp = 100;
    int noRecordsCount = 0;
    while (true) {
      final ConsumerRecords<String, FeedEntity> consumerRecords =
          consumer.poll(Duration.ofSeconds(1));
      if (consumerRecords.count() == 0) {
        noRecordsCount++;
        if (noRecordsCount > giveUp)
          break;
        else
          continue;
      }
      consumerRecords.forEach(record -> {
        log.info("Consumer Record: {}, {}, {}, {}", record.key(), record.value(),
            record.partition(), record.offset());
        handleFeedMessage(record.value());
      });
      consumer.commitAsync();
    }
    consumer.close();
  }

  abstract void handleFeedMessage(FeedEntity rawMessage);

}
