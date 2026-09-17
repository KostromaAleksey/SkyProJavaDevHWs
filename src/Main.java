import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] mass1 = {1, 2, 3};
        double[] mass2 = {1.57, 7.654, 9.986};
        String[] mass3 = {"a", "b", "c"};

        //task2
        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i]);
            if (i != mass1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass2[i]);
            if (i != mass2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i]);
            if (i != mass3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //task3
        for (int i = mass1.length - 1; i >= 0; i--) {
            System.out.print(mass1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = mass2.length - 1; i >= 0; i--) {
            System.out.print(mass2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = mass3.length - 1; i >= 0; i--) {
            System.out.print(mass3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //task4
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] % 2 != 0) {
                mass1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(mass1));
    }
}