// Take an array of numbers as input and check it is an array sorted in ascending order or not.

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scn.nextInt();

        int[] number = new int[n];

        System.out.println("Enter the numbers in array");

        for(int i=0; i<n ; i++){
            number[i] = scn.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<number.length - 1 ; i++){
            if (number[i] > number[i+1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order ");
        } else {
            System.out.println("The array is not sorted in ascending order ");
        }
    }
}
