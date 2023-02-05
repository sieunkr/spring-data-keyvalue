package com.example.springdatakeyvalue;

import org.springframework.data.keyvalue.repository.KeyValueRepository;

import java.util.List;

public interface CoffeeRepository extends KeyValueRepository<Coffee, String> {
}