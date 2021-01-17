package com.jkay.task.level02.lecture03;

/*
С каждым разом огромнее

В переменную hugeAmount нужно записать число 100500.
Используй переменные bigAmount, greatAmount и преобразование строки в число.
Для объявления и инициализации hugeAmount используй одну команду.
*/

public class Task04 {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount);

        System.out.println(hugeAmount);
    }
}
