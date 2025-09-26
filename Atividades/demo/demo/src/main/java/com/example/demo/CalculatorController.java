package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/calculate")
    public CalculatorResult calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation) {
        return calculatorService.calculate(num1, num2, operation);
    }
}
