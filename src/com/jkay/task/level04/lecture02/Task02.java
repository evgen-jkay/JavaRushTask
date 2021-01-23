package com.jkay.task.level04.lecture02;

import java.util.Scanner;

/*
Минимум из введенных чисел

Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ.
Выведи на экран минимальное число из введенных.
Если введено несколько таких чисел, необходимо вывести любое из них.
*/

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
    }
}
