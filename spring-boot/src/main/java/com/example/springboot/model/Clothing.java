package com.example.springboot.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
public class Clothing extends Product {

    private String size;

    public Clothing(UUID id, String name, Category category, String size) {
        super(id, name, category);
        this.size = size;
    }
}
