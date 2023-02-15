import java.time.Year;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4_6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("    Задача 1");
        int savings = 0;
        int month = 0;
        while (savings < 2_459) {
            month++;
            savings += 15;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings * 1000 + " рублей");
        }
    }

    public static void task2() {
        System.out.println("    Задача 2");
        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

    }

    public static void task3() {
        System.out.println("    Задача 3");
        int population = 12000000;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + population / 1000 * 9;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4_6() {
        System.out.println("    Задача 4-6");
        double money = 15000;
        int month = 0;
        while (month < 109) {
            month += 1;
            money = money * 1.07;
            if (month % 6 == 0) {
                System.out.println("Месяц" + month + ", накопления составляют " + money);
            }
        }
    }

    public static void task7() {
        System.out.println("    Задача 7");
        int day = 3;
        while (day <= 31) {
            System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет");
            day += 7;
        }
    }

    public static void task8() {
        System.out.println("    Задача 8");
        int year = 0;
        while (year <= 2123) {
            year += 79;
            if (year <= 2123 && year >= 1823) {
                System.out.println(year);
            }
        }
    }

}