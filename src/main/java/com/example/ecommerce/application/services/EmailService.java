package com.example.ecommerce.application.services;

public interface EmailService {
    void sendEmail(String recipientId, String message);
}