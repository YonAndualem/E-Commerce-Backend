package com.example.ecommerce.application.queries;

import lombok.Getter;

@Getter
public class GetProductByIdQuery {
    private final String productId;

    public GetProductByIdQuery(String productId) {
        this.productId = productId;
    }

}