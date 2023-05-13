package pro.skype.homework22.service;

import pro.skype.homework22.service.exception.IllegalArgumentException;

public interface CalculatorService {
    Integer plusTwoDigits(Integer firstDigit, Integer secondDigit);
    Integer minusTwoDigits(Integer firstDigit, Integer secondDigit);
    Integer multiplyTwoDigits(Integer firstDigit, Integer secondDigit);
    Integer divideTwoDigits(Integer firstDigit, Integer secondDigit) throws IllegalArgumentException;

    Integer catchException(Integer firstDigit, Integer secondDigit);
}
