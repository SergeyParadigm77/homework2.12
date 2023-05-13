package pro.skype.homework22.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.skype.homework22.service.CalculatorService;
import pro.skype.homework22.service.exception.IllegalArgumentException;

import java.util.stream.Stream;

public class CalculatorServiceImplParametrizedTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();
    public static Stream<Arguments> argumentsForSumTest() {
        return Stream.of(
                Arguments.of(10,10,20),
                Arguments.of(100,100,200),
                Arguments.of(0,10,10),
                Arguments.of(0,0,0),
                Arguments.of(-1000,1000,0)
        );
    }
    public static Stream<Arguments> argumentsForMinusTest() {
        return Stream.of(
                Arguments.of(10,10,0),
                Arguments.of(-100,100,-200),
                Arguments.of(0,10,-10),
                Arguments.of(0,0,0),
                Arguments.of(1000,0,1000)
        );
    }
    public static Stream<Arguments> argumentsForMultiplyTest() {
        return Stream.of(
                Arguments.of(10,10,100),
                Arguments.of(-10,100,-1000),
                Arguments.of(-100,-100,10000),
                Arguments.of(0,0,0),
                Arguments.of(1000,0,0)
        );
    }
    public static Stream<Arguments> argumentsForDivideTest() {
        return Stream.of(
                Arguments.of(10,10,1),
                Arguments.of(-100,1,-100),
                Arguments.of(-1000,-1000,1),
                Arguments.of(0,1000,0),
                Arguments.of(0,-1000,0)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsForSumTest")
    public void shouldReturnSum(Integer firstDigit, Integer secondDigit, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.plusTwoDigits(firstDigit, secondDigit));
    }
    @ParameterizedTest
    @MethodSource("argumentsForMinusTest")
    public void shouldReturnMinus(Integer firstDigit, Integer secondDigit, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.minusTwoDigits(firstDigit, secondDigit));
    }
    @ParameterizedTest
    @MethodSource("argumentsForMultiplyTest")
    public void shouldReturnMultiply(Integer firstDigit, Integer secondDigit, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.multiplyTwoDigits(firstDigit, secondDigit));
    }
    @ParameterizedTest
    @MethodSource("argumentsForDivideTest")
    public void shouldReturnDivide(Integer firstDigit, Integer secondDigit, Integer expectedResult) throws IllegalArgumentException {
        Assertions.assertEquals(expectedResult, calculatorService.divideTwoDigits(firstDigit, secondDigit));
    }
}
