package com.aaytugozkaya.kafka.controller;

import com.aaytugozkaya.kafka.payload.Student;
import com.aaytugozkaya.kafka.producer.KafkaJsonProducer;
import com.aaytugozkaya.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/json-messages")
public class MessageJsonController {

    private final KafkaJsonProducer kafkaJsonProducer;


    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody Student student) {
        kafkaJsonProducer.sendMessage(student);
        return ResponseEntity.ok("Message sent to Kafka topic");
    }

}
