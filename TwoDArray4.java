// Print the spiral order matrix as output for a matrix of numbers.

import java.util.Scanner;

public class TwoDArray4 {
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
    System.out.println("The Spiral order of the matrix is:");
    int rowStart = 0;
    int rowEnd = rows - 1;
    int colStart = 0;
    int colEnd = cols - 1;

    while (rowStart <= rowEnd && colStart <= colEnd) {
      for(int col=colStart; col<=colEnd; col++){
        System.out.print(numbers[rowStart][col] + " ");
      }
      rowStart++;

      for(int row=rowStart; row<=rowEnd; row++){
        System.out.print(numbers[row][colEnd] + " ");
      }
      colEnd--;

      if(rowStart <= rowEnd){
        for(int col=colEnd; col>=colStart; col--){
          System.out.print(numbers[rowEnd][col] + " ");
        }
        rowEnd--;
      }

      if(colStart <= colEnd){
        for(int row=rowEnd; row>=rowStart; row--){
          System.out.print(numbers[row][colStart] + " ");
        }
        colStart++;
      }
    }
  }
}