package com.jkay.task.level04.lecture02;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class Task03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = console.nextInt();
        int secondMin = console.nextInt();
        if (secondMin < min) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                secondMin = min;
                min = x;
            } else if (x < secondMin && x > min) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}
