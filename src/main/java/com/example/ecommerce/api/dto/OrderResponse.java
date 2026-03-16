package com.example.ecommerce.api.dto;

import java.util.List;

public class OrderResponse {
    private final String id;
    private final String customerId;
    private final List<String> productIds;
    private final double totalAmount;

    public OrderResponse(String id, String customerId, List<String> productIds, double totalAmount) {
        this.id = id;
        this.customerId = customerId;
        this.productIds = productIds;
        this.totalAmount = totalAmount;
    }

    public String getId() { return id; }
    public String getCustomerId() { return customerId; }
    public List<String> getProductIds() { return productIds; }
    public double getTotalAmount() { return totalAmount; }
}