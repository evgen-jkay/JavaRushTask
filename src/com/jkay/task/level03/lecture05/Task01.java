package com.jkay.task.level03.lecture05;

/*
Ищем максимум

У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.
Если числа одинаковые, то выводится любое.
Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a > b ? a : b);
    }
}
