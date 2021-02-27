package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double numbers[] =  {2.1, -7.3, 3.4, -2.0, 5.6, -1.3, 5.0, 4.3, 2.0, -3.7, 4.3, -2.7, 6.2, -5.2, 4.0};

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(Arrays.toString(numbers));
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    double tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }


            }
        }
        double plus = 0.0;
        int positive = 0;
        boolean isNegetive = false;

        for (double num : numbers) {
            if (num < 0) {
                isNegetive = true;
            } else if (isNegetive) {
                plus += num;
                positive++;
            }
        }
        double averageSum = plus / positive;
        System.out.println("Среднее арифмитическое значение положительних чисел " + averageSum);
    }
    }


