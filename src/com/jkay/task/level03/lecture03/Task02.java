package com.jkay.task.level03.lecture03;

import java.util.Scanner;

/*
Три числа

Ввести с клавиатуры три целых числа.
Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.
Примеры:
    а) при вводе чисел 1 2 2 получим вывод 2 2
    б) при вводе чисел 2 2 2 получим вывод 2 2 2
*/

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 == num2) {
            System.out.println(num1 + " " + num2);
        } else if (num1 == num3) {
            System.out.println(num1 + " " + num3);
        } else if (num2 == num3) {
            System.out.println(num2 + " " + num3);
        }
    }
}
