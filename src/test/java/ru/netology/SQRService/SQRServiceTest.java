package ru.netology.SQRService;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "'Square calculate, between numbers 10 and 99',10,99,3",
                    "'Square calculate, between numbers 10 and 16',10,16,1",
                    "'Square calculate, between numbers 10 and 17',10,17,2"
            }
    )
    void shouSquareCalculate(String test, int firstNumber, int secondNumber, int expected) {
        SQRService service = new SQRService();
        int squares = service.square(firstNumber, secondNumber);
        assertEquals(expected, squares);
    }
}