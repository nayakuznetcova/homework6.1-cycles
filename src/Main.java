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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int money = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + money;
            month = month + 1;
            System.out.println("Месяц " + month + ": сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 1;
        int total = 0;
        while (total < 10) {
            total = total + number;
            System.out.print(total + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println("      ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int populationMortality = 8;
        int birthRate = 17;
        int growthRate = birthRate - populationMortality;
        int year = 0;
        while (year < 10) {
            population = population + (population / 1000 * (growthRate));
            year = year + 1;
            System.out.println("Год " + year + ": численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int interestRate = 7;
        int money = 15000;
        for (int month = 1; money < 12_000_000; month++) {
            money = money + money / 100 * interestRate;
            System.out.println("Месяц " + month + " - " + money);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int interestRate = 7;
        int money = 15000;
        for (int month = 1; money < 12_000_000; month++) {
            money = money + money / 100 * interestRate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " - " + money);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int interestRate = 7;
        int money = 15000;
        for (int month = 1; month < 9 * 12; month++) {
            money = money + money / 100 * interestRate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " - " + money);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int d = firstFriday; d <= 31; d += 7) {
            System.out.println("Пятница " + d + " пора сдавать отчёт");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearFrom = 1823;
        int yearTo = 2123;
        for (int i = 0; i <= yearTo; i += 79) {
            if (i > yearFrom) {
                System.out.println("Год пролета кометы: " + i);
            }
        }
        System.out.println();
    }
}