package com.jkay.task.level02.lecture03;

/*
Пустота и пробелы

Заполни пробелы пустотой... или наоборот.
Используй переменную emptiness, строки с одним пробелом и конкатенацию строк,
чтобы записать в переменную fullness строку "пустота пустота пустота".
*/

public class Task02 {
    public static void main(String[] args) {
        String emptiness = "пустота";
        String fullness =  emptiness + " " + emptiness + " " + emptiness;
        System.out.println(fullness);
    }
}
