package com.jkay.task.level04.lecture00;

import java.util.Scanner;

/*
Суммирование

Напишем программу, в которой нужно вводить с клавиатуры числа и считать их сумму,
пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.
*/

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            String line = scanner.nextLine();

            if (line.equals("ENTER")) {
                isExit = true;
            } else {
                int number = Integer.parseInt(line);
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
