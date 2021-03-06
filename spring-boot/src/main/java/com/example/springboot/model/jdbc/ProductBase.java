package com.example.springboot.model.jdbc;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ProductBase {

    private UUID id;
    private String name;
    private Category category;

}
