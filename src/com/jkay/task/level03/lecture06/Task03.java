package com.jkay.task.level03.lecture06;

/*
Сломанная клавиатура

Амиго создал секретное слово для доступа к закрытой информации,
но у него сломалась клавиатура и теперь невозможно набирать буквы в верхнем регистре.
*/

import java.util.Scanner;

public class Task03 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if (secret.equalsIgnoreCase(pass)){
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
    }
}
