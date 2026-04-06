// import java.util.*;

// It is a GET Bit Operation.


public class BitManupulation1 {
  public static void main(String[] args) {
    int n = 5;
    int pos = 3;

    int bitMask = 1<<pos;

    if ((bitMask & n) == 0) {
      System.out.println("bit was zero");
    } else {
      System.out.println("bit was one");
    }
  }
}