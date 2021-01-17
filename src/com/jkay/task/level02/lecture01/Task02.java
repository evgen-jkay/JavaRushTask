package com.jkay.task.level02.lecture01;

/*
Последняя цифра числа

В переменной number записано число. В переменную lastDigit нужно записать последнюю цифру этого числа.
Для вычисления используй переменную number и оператор «остаток от деления».
Для объявления и инициализации lastDigit используй одну команду.
Подсказка: делить нужно на 10.
*/

public class Task02 {
    public static void main(String[] args) {
        int number = 546;
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}
