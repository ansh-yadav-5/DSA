// Find the factorial of a number

import java.util.Scanner;

public class Function5 {
    public static void printFactorial(int n){
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for (int i=n;i>=1 ; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printFactorial(n);
    }
}
