package com.example.springdatakeyvalue;

import lombok.RequiredArgsConstructor;
import org.springframework.data.keyvalue.core.KeyValueTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public List<CoffeeDTO> findAll() {
        return StreamSupport.stream(coffeeRepository.findAll().spliterator(), false)
                .map(CoffeeDTO::of)
                .collect(Collectors.toList());
    }

    public void createCoffee(CoffeeDTO coffeeDTO) {
        coffeeRepository.save(CoffeeDTO.toEntity(coffeeDTO));
    }
}
