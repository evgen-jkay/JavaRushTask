package com.jkay.task.level04.lecture02;

import java.util.Scanner;

/*
Максимум из введенных чисел

Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ.
Выведи на экран максимальное четное число из введенных.
Если введено несколько таких чисел, необходимо вывести любое из них.
*/

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x % 2 == 0 && x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
