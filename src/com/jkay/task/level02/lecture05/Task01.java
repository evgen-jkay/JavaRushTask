package com.jkay.task.level02.lecture05;
/*
Чтение и преобразование строк

Считай с клавиатуры три строки.
А затем:
    1. Выведи на экран третью строку в неизменном виде.
    2. Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
    3. Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
Пример ввода: Строка Номер РАЗ Втор
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}
