package com.jkay.task.level03.lecture02;
/*
Школа или институт

Есть программа, которая принимает на вход возраст и определяет, нужно в школу или уже пора в институт.
Но она работает неправильно. Например, пятилетнего ребенка отправляют в институт!
Исправить программу несложно: достаточно в нужном месте поставить фигурные скобки.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age > 5) {
                System.out.println("нужно ходить в школу");
            }
        } else {
            System.out.println("пора в институт");
        }
    }
}