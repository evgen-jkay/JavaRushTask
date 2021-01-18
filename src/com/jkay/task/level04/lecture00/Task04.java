package com.jkay.task.level04.lecture00;

/*
Заполненный прямоугольник

Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина),
заполненный буквой 'Q'.
Пример вывода:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
*/

public class Task04 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 10) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
