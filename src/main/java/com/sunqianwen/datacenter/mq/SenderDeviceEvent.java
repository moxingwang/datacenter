package com.sunqianwen.datacenter.mq;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by MoXingwang on 2017/5/6.
 */
@Component
public class SenderDeviceEvent {

    @Autowired
    private AmqpTemplate template;

    @Bean(name="deviceEventMessage")
    public Queue queueMessage() {
        return new Queue("topic.deviceEventMessage");
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange("deviceEventMessageExchange");
    }

    @Bean
    Binding bindingExchangeMessage(@Qualifier("deviceEventMessage") Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.deviceEventMessageExchange");
    }

    public void send(String command) {
        template.convertAndSend("topic.deviceEventMessage",command);
    }

}
