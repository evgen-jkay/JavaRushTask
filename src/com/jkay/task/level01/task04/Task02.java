package com.jkay.task.level01.task04;

/*
Мой юный друг

В 3126 году все знают команду System.out.println() и пользуются ею очень часто.
Не только студенты секретного центра JavaRush, даже дети начинают учить программирование именно с этой команды.
Давайте напишем программу, в которой будет выведен истинный год рождения моего друга, родившегося 8 лет назад.
*/

public class Task02 {
    public static void main(String[] args) {
        int currentYear = 3126;
        int friendBirthday = currentYear - 8;
        System.out.println(friendBirthday);
    }
}

