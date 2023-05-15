package pro.skype.homework22.service.impl;
import pro.skype.homework22.service.exception.IllegalArgumentException;
import org.springframework.stereotype.Service;
import pro.skype.homework22.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer plusTwoDigits(Integer firstDigit, Integer secondDigit) {
        return firstDigit + secondDigit;
    }

    @Override
    public Integer minusTwoDigits(Integer firstDigit, Integer secondDigit) {
        return firstDigit - secondDigit;
    }

    @Override
    public Integer multiplyTwoDigits(Integer firstDigit, Integer secondDigit) {
        return firstDigit * secondDigit;
    }

    @Override
    public Integer divideTwoDigits(Integer firstDigit, Integer secondDigit) throws IllegalArgumentException {
        if (secondDigit == 0) {
            throw new IllegalArgumentException("Неверный формат аргумента числа 2. На ноль делить нельзя");
        }
            return firstDigit / secondDigit;
    }
   @Override
   public Integer catchException(Integer firstDigit, Integer secondDigit) {
        try {
            return divideTwoDigits(firstDigit, secondDigit);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return null;
    }

}
