package com.example.springdatakeyvalue;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CoffeeDTO {
    private String id;
    private String name;
    private Integer price;

    public static CoffeeDTO of(Coffee coffee) {
        return CoffeeDTO.builder().id(coffee.getId()).name(coffee.getName()).price(coffee.getPrice()).build();
    }

    public static Coffee toEntity(CoffeeDTO coffeeDTO) {
        return Coffee.builder().id(coffeeDTO.getId()).name(coffeeDTO.getName()).price(coffeeDTO.getPrice()).build();
    }
}