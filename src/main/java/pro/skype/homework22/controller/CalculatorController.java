package pro.skype.homework22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.skype.homework22.service.CalculatorService;
import pro.skype.homework22.service.exception.IllegalArgumentException;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("/")
    public String welcome () {
        return "Добро пожаловать в калькулятор!";
    }
    @GetMapping("/plus")
    public String plusTwoDigits(@RequestParam(value = "num1", required = false) Integer firstDigit,
                                @RequestParam(value = "num2", required = false) Integer secondDigit) {
        if (firstDigit == null || secondDigit == null) {
            return "Неверные данные! Пожалуйста, укажите правильные аргументы числа 1 и числа 2";
        }
        return firstDigit + " + " + secondDigit + " = " + calculatorService.plusTwoDigits(firstDigit, secondDigit);
    }

    @GetMapping("/minus")
    public String minusTwoDigits(@RequestParam(value = "num1", required = false) Integer firstDigit,
                                 @RequestParam(value = "num2", required = false) Integer secondDigit) {
        if (firstDigit == null || secondDigit == null) {
            return "Неверные данные! Пожалуйста, укажите правильные аргументы числа 1 и числа 2";
        }
        return firstDigit + " - " + secondDigit + " = " + calculatorService.minusTwoDigits(firstDigit, secondDigit);
    }

    @GetMapping("/multiply")
    public String multiplyTwoDigits(@RequestParam(value = "num1", required = false) Integer firstDigit,
                                    @RequestParam(value = "num2", required = false) Integer secondDigit) {
        if (firstDigit == null || secondDigit == null) {
            return "Неверные данные! Пожалуйста, укажите правильные аргументы числа 1 и числа 2";
        }
        return firstDigit + " * " + secondDigit + " = " + calculatorService.multiplyTwoDigits(firstDigit, secondDigit);
    }

    @GetMapping("/divide")
    public String divideTwoDigits(@RequestParam(value = "num1", required = false) Integer firstDigit,
                                  @RequestParam(value = "num2", required = false) Integer secondDigit) throws IllegalArgumentException {
        if (firstDigit == null || secondDigit == null) {
            return "Неверные данные! Пожалуйста, укажите правильные аргументы числа 1 и числа 2";
        }
        return firstDigit + " / " + secondDigit + " = " + calculatorService.catchException(firstDigit, secondDigit);
    }
}
