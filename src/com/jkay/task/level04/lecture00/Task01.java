package com.jkay.task.level04.lecture00;

/*
Я никогда не буду работать за копейки

Используя цикл while вывести на экран сто раз цитату (переменная quote):
«Я никогда не буду работать за копейки. Амиго»
Каждое значение вывести с новой строки.
*/

public class Task01 {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";

        int i = 1;
        while (i <= 100) {
            System.out.println(quote);
            i++;
        }
    }
}
