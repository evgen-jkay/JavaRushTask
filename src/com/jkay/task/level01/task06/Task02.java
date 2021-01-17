package com.jkay.task.level01.task06;

/*
2 + 3 = 5

То, что 2 + 3 = 5, это же очевидно? Как оказалось, не всегда и не всем:
нашей тестовой программе это непонятно, потому что какой-то очень умный программист добавил в неё лишние строки.
Восстановите равновесие: закомментируйте какие-то из строк так, чтобы на экран вывелась фраза «2 плюс 3 равно 5».
*/

public class Task02 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        // System.out.print("два");
        System.out.print(b);
        System.out.print(" плюс ");
        // System.out.print(" минус ");
        System.out.print(a);
        // System.out.print("три");
        System.out.print(" равно ");
        // System.out.print(" будет ");
        // System.out.print("пять");
        System.out.print(a + b);
    }
}
