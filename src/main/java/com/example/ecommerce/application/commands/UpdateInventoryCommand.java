package com.example.ecommerce.application.commands;

import lombok.Getter;

@Getter
public class UpdateInventoryCommand {
    private final String productId;
    private final int quantity;

    public UpdateInventoryCommand(String productId, int quantity) {
        if (productId == null || productId.isBlank()) {
            throw new IllegalArgumentException("Product ID cannot be empty");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.productId = productId;
        this.quantity = quantity;
    }

}