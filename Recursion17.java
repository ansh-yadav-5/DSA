// Count total paths in a maze to move from (0,0) to (n,m).
// n = 3, m = 4.




public class Recursion17 {
  public static int countPaths(int i, int j, int n, int m){
    if (i == n || j == m) {
      return 0;
    }
    if (i == n-1 && j == m-1) {
      return 1;
    }

    int downpaths = countPaths(i+1, j, n, m);

    int rightPaths = countPaths(i, j+1, n, m);

    return downpaths + rightPaths;
  }
  public static void main(String[] args) {
   int n = 3, m = 3;
   int totalPaths = countPaths(0, 0, n, m);
    System.out.println(totalPaths);
  }
}
