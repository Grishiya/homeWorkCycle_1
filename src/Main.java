public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }

    public static void task2() {
        System.out.println("Задача 2.");
        for (int i = 10; i >= 1; i--)
            System.out.println(i);
    }

    public static void task3() {
        System.out.println("Задача 3.");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4.");
        for (int i = 10; i >= (-10); i--)
            System.out.println(i);
    }

    public static void task5() {
        System.out.println("Задача 5.");
        int startYear = 1904;
        int finishYear = 2096;
        for (; startYear <= finishYear; startYear = startYear + 4)
            System.out.println(startYear + " год является високосным");
    }

    public static void task6() {
        System.out.println("Задача 6.");
        for (int i = 0; i < 100; i = i + 7)
            System.out.println(i);
    }

    public static void task7() {
        System.out.println("Задача 7.");
        for (int i = 1; i <= 512; i = i + i)
            System.out.println(i);
    }

    public static void task8() {
        System.out.println("Задача 8.");
        int money = 29000;
        int month = 1;
        int moneySavedUpForMonth = 0;
        for (; month <= 12; month++) {
            moneySavedUpForMonth = moneySavedUpForMonth + money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + moneySavedUpForMonth + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("Задача 9.");
        int money = 29000;
        int month = 1;
        double moneySavedUpForMonth = 0;
        for (; month <= 12; month++) {
            moneySavedUpForMonth = moneySavedUpForMonth + moneySavedUpForMonth / 100;
            moneySavedUpForMonth = moneySavedUpForMonth + money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + moneySavedUpForMonth + " рублей.");
        }
    }

    public static void task10() {
        System.out.println("Задача 10.");
        for (int i = 1; i <= 10; i++) {
            int multipe = i * 2;
            System.out.println(multipe);
        }
    }
}
