package com.jkay.task.level02.lecture03;

/*
Конкатенация строк и чисел

В переменную digits нужно записать строку "60". Используй переменные x, y, z, пустую строку и конкатенацию строк.
*/

public class Task03 {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = x + y + "" + z;

        System.out.println(digits);
    }
}
