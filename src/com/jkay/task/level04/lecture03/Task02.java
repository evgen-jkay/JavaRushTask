package com.jkay.task.level04.lecture03;

/*
Сумма четных чисел

Напиши программу, которая выводит на экран сумму чисел от 1 до 17, кратных 3.
Для этого используй цикл for.
Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
*/

public class Task02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 17; i++) {
            if (i % 3 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
