package pro.skype.homework22.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.skype.homework22.service.exception.IllegalArgumentException;
import static pro.skype.homework22.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
    @Test
    public void shouldReturnWhenNum1Equals5PlusNum2Equals5() {
        Integer result = calculatorServiceImpl.plusTwoDigits(5, 5);
        Assertions.assertEquals(firstDigitFivePlusSecondDigitFive, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals10PlusNum2Equals2() {
        Integer result = calculatorServiceImpl.plusTwoDigits(10, 2);
        Assertions.assertEquals(firstDigitTenPlusSecondDigitTwo, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals5MinusNum2Equals5() {
        Integer result = calculatorServiceImpl.minusTwoDigits(5, 5);
        Assertions.assertEquals(firstDigitFiveMinusSecondDigitFive, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals10MinusNum2Equals2() {
        Integer result = calculatorServiceImpl.minusTwoDigits(10, 2);
        Assertions.assertEquals(firstDigitMinusPlusSecondDigitTwo, result);
    }

    @Test
    public void shouldReturnWhenNum1Equals5MultiplyNum2Equals5() {
        Integer result = calculatorServiceImpl.multiplyTwoDigits(5, 5);
        Assertions.assertEquals(firstDigitFiveMultiplySecondDigitFive, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals10MultiplyNum2Equals2() {
        Integer result = calculatorServiceImpl.multiplyTwoDigits(10, 2);
        Assertions.assertEquals(firstDigitTenMultiplySecondDigitTwo, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals5DivideNum2Equals5() {
        Integer result = calculatorServiceImpl.divideTwoDigits(5, 5);
        Assertions.assertEquals(firstDigitFiveDivideSecondDigitFive, result);
    }
    @Test
    public void shouldReturnWhenNum1Equals10DivideNum2Equals2() {
        Integer result = calculatorServiceImpl.divideTwoDigits(10, 2);
        Assertions.assertEquals(firstDigitTenDivideSecondDigitTwo, result);
    }
    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNum2Equals0() {
        Assertions.assertThrows(IllegalArgumentException.class, calculatorServiceImpl.catchException(10, 0));
    }
}
