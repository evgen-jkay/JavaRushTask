package com.jkay.task.level04.lecture02;

/*
Максимум из введенных чисел

Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ.
Выведи на экран максимальное четное число из введенных.
Если введено несколько таких чисел, необходимо вывести любое из них.
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x % 2 == 0 && x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
