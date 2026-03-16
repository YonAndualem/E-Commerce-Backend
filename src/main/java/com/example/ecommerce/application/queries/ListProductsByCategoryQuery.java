package com.example.ecommerce.application.queries;

import lombok.Getter;

@Getter
public class ListProductsByCategoryQuery {
    private final String category;

    public ListProductsByCategoryQuery(String category) {
        this.category = category;
    }

}