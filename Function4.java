// Make a function to add two numbers 

import java.util.Scanner;

public class Function4 {
    public static int calculateSum(int a, int b){
        int sum = a + b ;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        int sum = calculateSum(a, b);
        System.out.println(sum);
    }
}
