package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public CalculatorResult calculate(double num1, double num2, String operation) {
        double result = 0.0;
        String status = "sucesso";

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    status = "Erro: divisão por zero";
                    result = 0.0; // or NaN, but 0.0 is fine
                } else {
                    result = num1 / num2;
                }
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
            default:
                status = "Erro: operação inválida";
                break;
        }

        return new CalculatorResult(num1, num2, operation, result, status);
    }
}
