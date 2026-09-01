public class Main {
    public static void main(String[] args) {
        //task1
        byte clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }

        //task2
        int clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }

        //task3
        int year = 2021;
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        //task4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }

        //task5
        int monthNumber = 12;
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь - зима");
                    break;
                case 2:
                    System.out.println("Февраль - зима");
                    break;
                case 3:
                    System.out.println("Март - весна");
                    break;
                case 4:
                    System.out.println("Апрель - весна");
                    break;
                case 5:
                    System.out.println("Май - весна");
                    break;
                case 6:
                    System.out.println("Июнь - лето");
                    break;
                case 7:
                    System.out.println("Июль - лето");
                    break;
                case 8:
                    System.out.println("Август - лето");
                    break;
                case 9:
                    System.out.println("Сентябрь - осень");
                    break;
                case 10:
                    System.out.println("Октябрь - осень");
                    break;
                case 11:
                    System.out.println("Ноябрь - осень");
                    break;
                case 12:
                    System.out.println("Декабрь - зима");
                    break;
            }
        }
    }
}