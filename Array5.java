import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scn.nextInt();

        String[] Names = new String[n];

        System.out.println("Enter the names");
        for(int i=0; i<n ; i++){
            Names[i] = scn.next();
        }

        for(int i=0; i<n ; i++){
            System.out.println(" name " + (i + 1) + " is " + Names[i]);
        }
    }
}
