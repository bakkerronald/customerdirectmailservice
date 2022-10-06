package com.qualogy.customerdirectmailservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DirectMailListener {

    @KafkaListener(topics = "quickstart-events")
    public void listenForDirectMail(String message) {
        System.out.println("Received Message: " + message);
    }
}


