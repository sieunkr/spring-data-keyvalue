package com.example.springdatakeyvalue;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CoffeeController {

    private final CoffeeService coffeeService;

    @GetMapping("/coffees")
    public List<CoffeeDTO> get() {
        return coffeeService.findAll();
    }

    @PostMapping("/coffee")
    public void post(@RequestBody CoffeeDTO coffeeDTO) {
        coffeeService.createCoffee(coffeeDTO);
    }

    /*
    @GetMapping("/coffees/search")
    public CoffeeDTO get(@RequestParam String name) {
        return coffeeService.findByName(name);
    }
    
     */

}
