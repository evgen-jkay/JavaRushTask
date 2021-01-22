package com.jkay.task.level04.lecture01;

import java.util.Scanner;

/*
Показываем, что получаем

Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
Для этого необходимо использовать бесконечный цикл (while(true)).
Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
*/

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String console = scanner.nextLine();
            if (console.equalsIgnoreCase("enough")) {
                break;
            }
            System.out.println(console);
        }
    }
}
