package com.example.ecommerce.infrastructure.services;

import com.example.ecommerce.application.services.EmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(String recipientId, String message) {
        System.out.println("Sending email to customer " + recipientId + ": " + message);
        // Integration with SMTP or external provider here
    }
}