package ru.netology.SQRService;

public class SQRService {
    public int square(int firstNumber, int secondNumber) {
        int counter = 0;
        int minNumber = 10;
        int maxNumber = 99;
        for (int j = minNumber; j < maxNumber; j++) {
            if (j * j >= firstNumber && j * j <= secondNumber) {
                counter++;
            }
        }
        return counter;
    }
}
