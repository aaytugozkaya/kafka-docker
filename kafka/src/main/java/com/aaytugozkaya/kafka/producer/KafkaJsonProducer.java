package com.aaytugozkaya.kafka.producer;

import com.aaytugozkaya.kafka.payload.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaJsonProducer {
    //KafkaTemplate<Key, Value> --> KafkaTemplate<String, Student>
    //This producer sends a Student object to the Kafka topic as a JSON message.

    private final KafkaTemplate<String, Student> kafkaTemplate;

    public void sendMessage(Student student) {
        Message<Student> message = MessageBuilder
                .withPayload(student)
                .setHeader(KafkaHeaders.TOPIC, "my-first-topic")
                .build();
        log.info("Producing message to my-first-topic: {}", student);
        kafkaTemplate.send(message);
    }
}
