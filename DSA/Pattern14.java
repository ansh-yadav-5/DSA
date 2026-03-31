// x * 1 = x
// x * 2 = 2x
// ... x * 10 = 10x


import java.util.*;


public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        for(int i = 1; i <= 10; i++){
            int v = x * i;
            System.out.println(x + " * " + i + "=" + v);
        }


    }
}
