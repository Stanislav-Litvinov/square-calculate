package ru.netology.SQRService;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "'Square calculate, between numbers 200, 300',200,300,3",
                    "'Square calculate, between first number is square of 15 and other is 300',225,300,3",
                    "'Square calculate, between first and second numbers is square of 15',225,225,1",
                    "'Square calculate, between first number bigger then second number',300,200,0",
                    "'Square calculate, between first number bigger then second number',0,225,6",
                    "'Square calculate, between first number bigger then second number',200,289,3"
            }
    )
    void shouSquareCalculate(String test, int firstNumber, int secondNumber, int expected) {
        SQRService service = new SQRService();
        int squares = service.square(firstNumber, secondNumber);
        assertEquals(expected, squares);
    }
}