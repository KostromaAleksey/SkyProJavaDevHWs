public class Main {
    public static void main(String[] args) {
        //task1
        int firstFriday = 3;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        //task2
        int dist = 0;
        do {
            dist++;
            if (dist % 500 == 0) {
                System.out.println("Держитесь! Осталось " + dist + " метров");
            }
        } while (dist <= 42195);

        dist = 0;
        for (; dist <= 42195; ) {
            dist++;
            if (dist % 500 == 0) {
                System.out.println("Держитесь! Осталось " + dist + " метров");
            }
        }

        //task3
        int sum = 1000;
        int day = 0;
        while (sum > 0) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            sum -= 100;
        }
        System.out.println("Бюджета хватит на " + day + " дней");

        sum = 1000;
        day = 0;
        for (; sum > 0; ) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            sum -= 100;
        }
        System.out.println("Бюджета хватит на " + day + " дней");

        //task4
        int month = 0;
        double total = 0;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total *= 1.07;
            }
            System.out.println("Месяц " + month + " Сумма " + total);
            if (total >= 12000000) {
                break;
            }
        }

        //task5
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев");
                if (overheats > 3) {
                    System.out.println("Досрочное завершение");
                    break;
                }
                minute += 2;
                continue;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}