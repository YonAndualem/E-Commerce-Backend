package com.example.ecommerce.domain.factories;

import com.example.ecommerce.domain.entities.Order;
import com.example.ecommerce.domain.valueobjects.Money;

import java.util.List;
import java.util.UUID;

public class OrderFactory {
	private OrderFactory() {
	}

	public static Order createOrder(String customerId, List<String> productIds, Money totalAmount) {
		// Keep it simple: domain entity currently accepts raw primitives.
		return new Order(UUID.randomUUID().toString(), customerId, productIds, totalAmount);
	}
}
