package com.jkay.task.level04.lecture03;

/*
Четные числа

Напиши программу, в которой с помощью цикла for выведи на экран чётные числа от 1 до 15.
Каждое значение нужно вывести с новой строки.
*/

public class Task01 {
    public static void main(String[] args) {
        for (int i = 2; i <= 15; i += 2) {
            System.out.println(i);
        }
    }
}
