package lesson03;

public class Fibonacci {

    public static void printFibonacciNumbers(int nbOfResults) {

        if (nbOfResults <= 0) {
            System.out.println("Please enter a positive number more than 0");
        } else {
            int a = 0;
            int b = 1;
            int[] f = new int[nbOfResults];
            for (int i = 0; i <= nbOfResults - 1; i++) {
                f[i] = a;
                a = a + b;
                f[i + 1] = b;
                b = a + b;
                i++;
            }
            for (int i = 0; i <= nbOfResults - 1; i++) {
                System.out.println(f[i]);
            }
        }
    }

}
