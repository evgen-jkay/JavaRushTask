package com.jkay.task.level03.lecture04;
/*
Координатные четверти

Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x",
а второе - координата "y"). Известно, что точка не лежит на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }
}
