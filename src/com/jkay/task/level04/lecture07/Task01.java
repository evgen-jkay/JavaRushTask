package com.jkay.task.level04.lecture07;

import java.util.Scanner;

/*
Скорость ветра

Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
Поэтому сделаем конвертер величин скорости из м/с в км/ч.
Исходную величину скорости ветра в м/с нужно получить,
*/

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speedInMetersPerSecond = scanner.nextInt();
        int speedInKilometersPerHour = (int) Math.round(speedInMetersPerSecond * 3.6);
        System.out.println(speedInKilometersPerHour);
    }
}
