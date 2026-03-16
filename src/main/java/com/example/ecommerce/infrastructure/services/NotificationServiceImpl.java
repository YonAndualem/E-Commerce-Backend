package com.example.ecommerce.infrastructure.services;

import com.example.ecommerce.application.services.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("Notification: " + message);
        // Integration with push/SMS/in-app alerts here
    }
}