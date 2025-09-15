// Reverse a number

import java.util.*;


public class Main5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n > 0) {
            int dig = n %  10;
            n = n / 10 ;
            System.out.println(dig);
        }
    }
    
}
