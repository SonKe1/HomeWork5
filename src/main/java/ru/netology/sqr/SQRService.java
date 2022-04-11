package ru.netology.sqr;

public class SQRService {
    public int calculate(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr < a) {
                continue;
            }
            if (sqr > b) {
                continue;
            }
            count++;
        }
        return count;
    }
}

