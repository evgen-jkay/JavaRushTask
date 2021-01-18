package com.jkay.task.level03.lecture04;

/*
Треугольник

Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
Для этого тебе нужно:
1. Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
2. Определить возможность существования треугольника по сторонам.
*/

import java.util.Scanner;

public class Task01 {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
