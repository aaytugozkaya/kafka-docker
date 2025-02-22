package com.aaytugozkaya.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    //KafkaTemplate is a class that provides methods to send data to a Kafka topic.
    //It is a generic class that takes two parameters, the key and the value of the message.
    //KafkaTemplate<Key,Value>
    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Producing message to my-first-topic: {}", message);
        kafkaTemplate.send("my-first-topic",message);
    }
}
