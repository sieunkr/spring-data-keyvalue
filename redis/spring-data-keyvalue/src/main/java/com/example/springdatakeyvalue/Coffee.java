package com.example.springdatakeyvalue;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;

@Getter
@Builder
@KeySpace("coffees")
public class Coffee {

    @Id
    private String id;
    private String name;
    private Integer price;

}
