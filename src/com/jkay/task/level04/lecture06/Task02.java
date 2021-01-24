package com.jkay.task.level04.lecture06;

import java.util.Scanner;

/*
Деление целых чисел

Давай разделим ящик колы на кабинет программистов.
Для этого напишем программу, в которой:
1. Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике. Второе - количество людей в кабинете.
2. Вывести на экран результат деления первого числа на второе.
*/

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        double result = (number1 * 1.0 / number2);
        System.out.println(result);
    }
}