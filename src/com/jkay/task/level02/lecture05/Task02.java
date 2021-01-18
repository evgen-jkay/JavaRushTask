package com.jkay.task.level02.lecture05;

import java.util.Scanner;

/*
Чтение чисел

Считай с клавиатуры три целых числа. Выведи на экран их среднее арифметическое.
Пример ввода:
51 202 101
Пример вывода: 118
Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
Используй деление без остатка.
*/

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println((num1 + num2 + num3) / 3);
    }
}
