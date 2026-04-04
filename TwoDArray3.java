// for a given matrix N X M, print its transpose.

import java.util.Scanner;

public class TwoDArray3 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns in the matrix:");
    int rows = scn.nextInt();
    int cols = scn.nextInt();
    int[][] numbers = new int[rows][cols];

    System.out.println("Enter the elements of the matrix:");
    // input
    for(int i=0; i<rows; i++){
      for(int j=0; j< cols; j++){
        numbers[i][j] = scn.nextInt();
      }
    }

    
    System.out.println("Transpose of the matrix:");
    for(int j=0; j< cols; j++){
      for(int i=0; i<rows; i++){
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }

  }
}
