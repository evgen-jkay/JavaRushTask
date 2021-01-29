package com.jkay.task.level05.lecture00;

/*
Четные и нечетные ячейки массива

В методе main(String[]) тебе нужно заполнить массив strings значениями.
Если индекс массива чётный - присвоить значение "Чётный"(ноль - цифра чётная), иначе присвоить "Нечётный".
Вывод текста в консоль в тестировании не участвует.
*/

public class Task02 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[20];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print("index = " + i);
            System.out.println(" value = " + strings[i]);
        }
    }
}
