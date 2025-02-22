package com.aaytugozkaya.wikimedia.controller;

import com.aaytugozkaya.wikimedia.producer.WikimediaProducer;
import com.aaytugozkaya.wikimedia.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {
    private final WikimediaStreamConsumer streamConsumer;

    @GetMapping
    public void startStream() {
        streamConsumer.consumeStreamAndPublish();
    }
}
