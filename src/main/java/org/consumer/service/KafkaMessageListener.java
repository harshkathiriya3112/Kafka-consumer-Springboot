package org.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaMessageListener.class);


    /**
     * message: this parameter type should be same as the data produced by the producer.
     *
     *  Group Id is mandatory here, even if single instance of consumer is there,
     *  if not specified, will throw an error
     */

    @KafkaListener(topics ="programmatically_created_topic",groupId = "26-october-1")
    public void consume(String message) {
        LOGGER.info("consumer1 consume the message {}",message);
    }

    @KafkaListener(topics ="programmatically_created_topic",groupId = "26-october-1")
    public void consume2(String message) {
        LOGGER.info("consumer2 consume the message {}",message);
    }

    @KafkaListener(topics ="programmatically_created_topic",groupId = "26-october-1")
    public void consume3(String message) {
        LOGGER.info("consumer3 consume the message {}",message);
    }

    @KafkaListener(topics ="programmatically_created_topic",groupId = "26-october-1")
    public void consume4(String message) {
        LOGGER.info("consumer4 consume the message {}",message);
    }
}
