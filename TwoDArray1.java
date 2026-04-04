import java.util.Scanner;

public class TwoDArray1 {
  public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int rows = scn.nextInt();
     int cols = scn.nextInt();

     int[][] numbers = new int[rows][cols];

    // input
    for(int i=0; i<rows; i++){
      for(int j=0; j< cols; j++){
        numbers[i][j] = scn.nextInt();
      }
    }

    System.out.println("Output :");

    // output
    for(int i=0; i<rows; i++){
      for(int j=0; j< cols; j++){
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
  }
}
