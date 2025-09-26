//  npr problem solving

import java.util.*;

public class Function1 {
    public static int fact(int x){
        int rv = 1;
        for(int i = 1; i <= x; i++){
            rv = rv * i;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nfact = fact(n);
        int nrfact = fact(n - r);
        int npr = nfact / nrfact;
        System.out.println(n + "P" + r + " = " + npr);
    }
}
