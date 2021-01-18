package com.jkay.task.level03.lecture05;

/*
Высокая точность

Напиши программу, которая считывает с клавиатуры два вещественных числа и выдает сообщение о том,
равны ли эти числа с точностью до одной миллионной.
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if ( Math.abs(num2 - num1) < 0.000001 )
            System.out.println("Числа равны");
        else
            System.out.println("Числа не равны");
    }
}