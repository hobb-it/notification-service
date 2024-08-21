package com.hobbit.notificationService.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "notificationService")
public class EmailConsumer {

    @RabbitHandler
    public void readMessage(String emailAndName) {
        int breakIndex = emailAndName.indexOf(",");
        String email = emailAndName.substring(0, breakIndex);
        String name = emailAndName.substring(breakIndex+1);
        String emailMessage = "Hello, " + name + "!\nWe thank you for participating in the HOBB.IT project.";
        System.out.println("Sent email to " + email + " with message:\n" + emailMessage);
    }
}
