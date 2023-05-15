package pro.skype.homework22.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.skype.homework22.service.CalculatorService;
import pro.skype.homework22.service.exception.IllegalArgumentException;
import static pro.skype.homework22.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();
    @Test
    public void shouldReturnWhenNum1Equals5PlusNum2Equals5() {
        Integer result = calculatorService.plusTwoDigits(5, 5);
        Assertions.assertEquals(firstDigitFivePlusSecondDigitFive, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals10PlusNum2Equals2() {
        Integer result = calculatorService.plusTwoDigits(10, 2);
        Assertions.assertEquals(firstDigitTenPlusSecondDigitTwo, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals5MinusNum2Equals5() {
        Integer result = calculatorService.minusTwoDigits(5, 5);
        Assertions.assertEquals(firstDigitFiveMinusSecondDigitFive, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals10MinusNum2Equals2() {
        Integer result = calculatorService.minusTwoDigits(10, 2);
        Assertions.assertEquals(firstDigitMinusPlusSecondDigitTwo, result);
    }

    @Test
    public void shouldReturnWhenNum1Equals5MultiplyNum2Equals5() {
        Integer result = calculatorService.multiplyTwoDigits(5, 5);
        Assertions.assertEquals(firstDigitFiveMultiplySecondDigitFive, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals10MultiplyNum2Equals2() {
        Integer result = calculatorService.multiplyTwoDigits(10, 2);
        Assertions.assertEquals(firstDigitTenMultiplySecondDigitTwo, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals5DivideNum2Equals5() {
        Integer result = calculatorService.catchException(5, 5);
        Assertions.assertEquals(firstDigitFiveDivideSecondDigitFive, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals10DivideNum2Equals2() {
        Integer result = calculatorService.catchException(10, 2);
        Assertions.assertEquals(firstDigitTenDivideSecondDigitTwo, result);
    }
   @Test
    public void shouldThrowIllegalArgumentExceptionWhenNum2Equals0() {
       Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divideTwoDigits(10, 0));
    }
}
