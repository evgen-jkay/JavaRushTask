package com.jkay.task.level03.lecture01;

import java.util.Scanner;

/*
Тепло или холодно

Ввести с клавиатуры температуру на улице.
Если температура меньше 0, вывести надпись "на улице холодно", иначе - вывести надпись "на улице тепло".
*/

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("на улице холодно");
        } else {
            System.out.println("на улице тепло");
        }
    }
}
