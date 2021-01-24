package com.jkay.task.level04.lecture06;

import java.util.Scanner;

/*
Площадь окружности

Для решения этой задачи нужно:
1. Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
2. Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат
*/

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        if (radius > 0) {
            double pi = 3.14;
            int square = (int) (pi * radius * radius);
            System.out.println(square);
        }
    }
}
