public class Main {
    public static void main(String[] args) {
        //task1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то " +
                    "он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то " +
                    "он не достиг совершеннолетия, нужно немного подождать");
        }

        //task2
        int airTemperature = 19;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }

        //task3
        int speed = 65;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //task4
        age = 44;
        if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        //task5
        age = 9;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему " +
                    "нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему " +
                    "можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему " +
                    "можно кататься без сопровождения взрослого)");
        }

        //task6
        int passengerNumber = 78;
        if (passengerNumber <= 102) {
            if (passengerNumber <= 60) {
                System.out.println("В вагоне есть сидячие и стоячие места");
            } else {
                System.out.println("В вагоне есть только стоячие места");
            }
        } else {
            System.out.println("Вагон заполнен");
        }

        //task7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else {
                System.out.println(three);
            }
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}