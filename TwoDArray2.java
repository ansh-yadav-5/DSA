// Take a matrix as input from the user. Search for a given number in the matrix and print the location of the number if found. 

import java.util.Scanner;

public class TwoDArray2 {
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

    System.out.println("Enter the number to search in the matrix:");
    int X = scn.nextInt();

    for(int i=0; i<rows; i++){
      for(int j=0; j< cols; j++){
        if(numbers[i][j] == X){
          System.out.println("Number found at location: (" + i + ", " + j + ")");
          return;
        }
      }
    }
  }
}
