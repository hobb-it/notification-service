package com.hobbit.notificationService.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class AppConfig {

    @Bean
    public Queue queue() {
        return new Queue("notificationService");
    }

}