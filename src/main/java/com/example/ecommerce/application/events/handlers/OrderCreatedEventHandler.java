package com.example.ecommerce.application.events.handlers;

import com.example.ecommerce.domain.events.InventoryUpdatedEvent;
import com.example.ecommerce.infrastructure.services.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class InventoryUpdatedEventHandler {
    private final NotificationService notificationService;

    public InventoryUpdatedEventHandler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void handle(InventoryUpdatedEvent event) {
        // Notify system or customer about inventory change
        notificationService.notify("Product " + event.getProductId() +
                " stock updated to " + event.getNewQuantity());
    }
}