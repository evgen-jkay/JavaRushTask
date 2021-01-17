package com.jkay.task.level01.task06;

/*
Комментарии излишни

Не все комментарии одинаково полезны!
Иногда они появляются в коде, если программист не уверен в какой-то строчке и хочет вернуться к ней позднее.
Так и с этой задачей получилось: в ней один лишний комментарий, отчего программа делает не то, что нужно.
Раскомментируйте одну строку, чтобы получить правильный результат!
*/

public class Task01 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
