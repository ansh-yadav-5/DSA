// It is a Update Bit Operation

import java.util.Scanner;

public class BitManupulation4 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int oper = scn.nextInt();
    int n = 5;
    int pos =1;

    int bitMask = 1<<pos;
    if (oper == 1) {
      // SET
      int newNumber = bitMask | n;
      System.out.println(newNumber);
    } else {
      // CLEAR
      int newBitMask = ~(bitMask);
      int newNumber = newBitMask & n;
      System.out.println(newNumber);
    }

    scn.close();

  }
}
