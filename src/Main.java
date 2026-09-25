import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task1
        int year = 2020;
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

        //task2
        int clientDeviceYear = LocalDate.now().getYear();
        System.out.println(getAppLink(1, clientDeviceYear));

        //task3
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + getDeliveryDays(deliveryDistance));
    }

    public static boolean isLeapYear(int year) {
        return year >= 1584 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static String getAppLink(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else {
            return "Не удалось подобрать ссылку по параметрам!";
        }
    }

    public static int getDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            throw new RuntimeException("Доставка не осуществляется!");
        }
    }
}