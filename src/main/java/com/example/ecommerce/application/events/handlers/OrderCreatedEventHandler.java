package com.example.ecommerce.application.events.handlers;

import com.example.ecommerce.application.services.EmailService;
import com.example.ecommerce.application.services.NotificationService;
import com.example.ecommerce.application.services.ShippingService;
import com.example.ecommerce.domain.events.OrderCreatedEvent;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedEventHandler {
    private final NotificationService notificationService;
    private final EmailService emailService;
    private final ShippingService shippingService;

    public OrderCreatedEventHandler(NotificationService notificationService,
                                    EmailService emailService,
                                    ShippingService shippingService) {
        this.notificationService = notificationService;
        this.emailService = emailService;
        this.shippingService = shippingService;
    }

    public void handle(OrderCreatedEvent event) {
        String orderId = event.getOrderId().toString();
        String customerId = event.getCustomerId();

        notificationService.notify("Order " + orderId + " created for customer " + customerId);
        emailService.sendEmail(customerId, "Your order " + orderId + " has been placed successfully.");
        shippingService.bookShipment(orderId, customerId);
    }
}
