// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Function6 {
    public static int findAverage(int a , int b , int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int average = findAverage(a, b, c);
        System.out.println(average);
    }
}
