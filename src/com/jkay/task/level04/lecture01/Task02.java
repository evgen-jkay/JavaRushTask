package com.jkay.task.level04.lecture01;

/*
Сумма чисел, не кратных 3

Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3.
Для этого используй цикл while.
Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
*/

public class Task02 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum += number;
            number++;
        }
        System.out.println(sum);
    }
}
