package com.aaytugozkaya.kafka.consumer;

import com.aaytugozkaya.kafka.payload.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaJsonConsumer {
    @KafkaListener(topics = "my-first-topic", groupId = "myGroup")
    public void consumeMessage(Student student) {
        log.info("Consumed message from my-first-topic: {}", student.toString());
    }
}
