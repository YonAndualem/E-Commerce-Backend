package com.example.ecommerce.application.events.handlers;

import com.example.ecommerce.application.services.NotificationService;
import com.example.ecommerce.domain.events.OrderCreatedEvent;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedEventHandler {
    private final NotificationService notificationService;

    public OrderCreatedEventHandler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void handle(OrderCreatedEvent event) {
        // Notify system/customer about new order
        notificationService.notify(
                "Order " + event.getOrderId() + " created for customer " + event.getCustomerId()
        );
    }
}