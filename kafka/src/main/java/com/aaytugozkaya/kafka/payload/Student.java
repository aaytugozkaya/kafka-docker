package com.aaytugozkaya.kafka.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    //It is a class that will be shared between the producer and the consumer.
    private Integer id;
    private String firstname;
    private String lastname;
}
