package ru.netology.sqr;

public class SQRService {
    public int calculate(long minD, long maxD) {
        int count = 0;
        if (minD <= maxD) {
            for (int i = 10; i <= 99; i++) {
                int x = i * i;
                if (x <= maxD) {
                    if (x >= minD) {
                        count++;

                    }
                }
            }
        } else {
            System.out.println("Некорректные граничные значения");
        }
        return (count);
    }
}
