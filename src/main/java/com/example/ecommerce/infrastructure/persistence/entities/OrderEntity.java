package com.example.ecommerce.infrastructure.persistence.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    private UUID id;

    @Version
    private Long version;

    private String customerId;
    private double totalAmount;
    private String currency;

    @ElementCollection
    private List<UUID> productIds;

    private String shippingStreet;
    private String shippingCity;
    private String shippingZipCode;
    private String shippingCountry;

    // Getters and setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public Long getVersion() { return version; }
    public void setVersion(Long version) { this.version = version; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public List<UUID> getProductIds() { return productIds; }
    public void setProductIds(List<UUID> productIds) { this.productIds = productIds; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getShippingStreet() { return shippingStreet; }
    public void setShippingStreet(String shippingStreet) { this.shippingStreet = shippingStreet; }

    public String getShippingCity() { return shippingCity; }
    public void setShippingCity(String shippingCity) { this.shippingCity = shippingCity; }

    public String getShippingZipCode() { return shippingZipCode; }
    public void setShippingZipCode(String shippingZipCode) { this.shippingZipCode = shippingZipCode; }

    public String getShippingCountry() { return shippingCountry; }
    public void setShippingCountry(String shippingCountry) { this.shippingCountry = shippingCountry; }
}
