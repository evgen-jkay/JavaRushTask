package com.jkay.task.level05.lecture00;

import java.util.Arrays;

/*
Работаем с элементами массива

Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный,
если значение этого элемента чётное.
*/

public class Task03 {
    public static int[] array = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (element % 2 == 0) {
                array[i] = -element;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
