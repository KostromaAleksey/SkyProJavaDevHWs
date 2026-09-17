import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] inputArray1 = {100, 5000, 37800, 5, 404};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        int mid = 0;
        for (int money : inputArray1) {
            sum += money;
            if (money > max) {
                max = money;
            }
            if (money < min) {
                min = money;
            }
        }
        mid = sum / inputArray1.length;
        double[] outputArray1 = {sum, max, min, mid};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        //task2
        int[] inputArray2 = {100, 5000, 37800, 5, 404};
        float[] outputArray2 = new float[5];
        int i = 0;
        for (int money : inputArray2) {
            outputArray2[i] = money * 1.13f;
            i++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        //task3
        int[] inputArray3 = {100, 5000, 37800, 5, 404};
        boolean[] outputArray3 = new boolean[5];
        i = 0;
        for (int bonus : inputArray3) {
            outputArray3[i] = bonus > 5000;
            i++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        //task4
        int[] inputArray4 = {100, 5000, 37800, -5, 404};
        boolean overdue = false;
        for (int balance : inputArray4) {
            if (balance < 0) {
                overdue = true;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(overdue);

        //task5
        int[] inputArray5 = {100, 5000, 37800, -5, 404};
        int months = 0;
        for (int money : inputArray5) {
            if (money > 0) {
                months++;
            }
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println("Прибыльных месяцев " + months);
    }
}