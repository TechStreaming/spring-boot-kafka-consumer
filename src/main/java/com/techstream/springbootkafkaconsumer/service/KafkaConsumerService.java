package com.techstream.springbootkafkaconsumer.service;

import com.techstream.springbootkafkaconsumer.model.UserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    private static final String TOPIC_NAME = "TECHSTREAMS";
    private static final String TOPIC_NAME_2 = "TECHSTREAMS_TEST2";


    @KafkaListener(topics = TOPIC_NAME_2, groupId = "group_id",
            containerFactory = "kafkaListenerContainerFactory")
    public void cosumeMessage(String message) {
        log.info("Consumed Message {}", message);
    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "group_id_user"
            , containerFactory = "userKafkaListenerFactory")
    public void cosumeUser(UserDetails userDetails) {
        log.info("Consumed userdetails {}", userDetails.toString());
    }
}
