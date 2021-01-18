package com.jkay.task.level03.lecture03;
/*
Измерим температуру тела

Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том,
что температура тела высокая, низкая или нормальная, в зависимости от условий.
В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая),
в которые нужно вынести соответствующие условия и вместо выражений сравнения использовать эти переменные
*/

import java.util.Scanner;

public class Task01 {
    public static boolean isHigh;
    public static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();

        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;

        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
