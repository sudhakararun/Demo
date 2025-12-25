package com.math.api.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/demo")
public class DemoController {
    // ➕ Addition
    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    // ➖ Subtraction
    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    // ✖️ Multiplication
    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    // ➗ Division (with error handling)
    @GetMapping("/divide")
    public String divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            return "Error: Division by zero is not allowed.";
        }
        return String.valueOf(a / b);
    }

}
