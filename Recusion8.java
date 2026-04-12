// Tower of Hanoi using recursion
// Time Complexity: O(2^n)


public class Recusion8 {
    public static void towerofHanoi(int n, char src, char dest, char helper) {
        if (n == 1) {
            System.out.println("Move 1st disc from " + src + " to " + dest);
            return;
        }
        towerofHanoi(n-1, src, helper, dest);
        System.out.println("Move " + n + "th disc from " + src + " to " + dest);
        towerofHanoi(n-1, helper, dest, src);
    }
    public static void main(String[] args) {
        int n = 3;
        towerofHanoi(n, 'A', 'C', 'B');
    }
}
