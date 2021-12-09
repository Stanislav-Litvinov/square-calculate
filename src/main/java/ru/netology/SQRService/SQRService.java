package ru.netology.SQRService;

public class SQRService {
    public int square(int firstNumber, int secondNumber) {
        int counter = 0;
        for (int j = firstNumber; j < secondNumber; j++) {
            if (j * j >= 200 && j * j <= 300) {
                counter++;
            }
        }
        return counter;
    }
}
