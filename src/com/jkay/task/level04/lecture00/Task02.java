package com.jkay.task.level04.lecture00;

/*
Все любят Мамбу

Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести:
<имя> любит меня (переменная text).
Каждый вывод - с новой строки.
*/

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        String text = " любит меня.";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int i = 1;
        while (i <= 10) {
            System.out.println(name + text);
            i++;
        }
    }
}
