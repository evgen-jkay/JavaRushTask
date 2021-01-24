package com.jkay.task.level04.lecture07;

import java.util.Scanner;

/*
Стакан наполовину пуст или наполовину полон?

В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
*/

public class Task02 {
    public static void main(String[] args) {
        double glass = 0.5;

        Scanner scanner = new Scanner(System.in);
        boolean isOptimist = scanner.nextBoolean();
        int result;
        if (isOptimist) {
            result = (int) Math.ceil(glass);
        } else {
            result = (int) Math.floor(glass);
        }
        System.out.println(result);
    }
}
