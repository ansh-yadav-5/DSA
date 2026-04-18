// Print all permutation of a string.
// ex- "abc" ->  3p3 = 3! = 6

// O(n!)


public class Recursion16 {
  public static void printPerm(String str, String permutation){
    if (str.length() == 0) {
      System.out.println(permutation);
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      char currChar = str.charAt(i);
      String newStr = str.substring(0,i) + str.substring(i+1);
      printPerm(newStr, permutation+currChar);
    }
  }
  public static void main(String[] args) {
    String str = "abc";
    printPerm(str, " ");
  }
}
