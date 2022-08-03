package ru.netology.sqr;

public class SQRService {

    public int calculSqr(int min, int max) {
        int counter = 0; // счетчик квадратов числел диапазона

        for (int i = 10; i <= 99; i++) {
            int a = i * i;
            if (a >= min && a <= max) {
                counter = counter + 1;
            }
        }
        return counter;
    }

}





