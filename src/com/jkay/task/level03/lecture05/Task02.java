package com.jkay.task.level03.lecture05;

import java.util.Scanner;

/*
Через тернии...

Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.
Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
Перепиши программу без использования тернарного оператора.
*/

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
        String result;
        if (number < 5) {
            result = "число меньше 5";
        } else if (number > 5) {
            result = "число больше 5";
        } else {
            result = "число равно 5";
        }

        System.out.println(result);
    }
}
