package com.example.camel.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ActiveMqSenderRouter extends RouteBuilder {
    @Override
    public void configure() {
        from("timer:active-mq-timer?period=10000")
                .transform().constant("Message for Active MQ")
                .log("${body}")
                .to("activemq:my-activemq-queue");
    }
}
