package com.jkay.task.level03.lecture01;

/*
Призывная кампания

Ввести с клавиатуры имя и возраст.
Если возраст в пределах 18-28 (включительно), то вывести надпись "Имя, явитесь в военкомат",
где Имя - это имя, введенное ранее с клавиатуры.
Пример ввода: Amigo 18 Пример вывода: Amigo, явитесь в военкомат
*/

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        String militaryCommisar = ", явитесь в военкомат";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age >= 18 && age <= 28)
            System.out.println(name + militaryCommisar);
    }
}
