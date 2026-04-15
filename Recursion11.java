// Check if an array is sorted(Strictly Increasing)
// {1,2,3,4,5}



public class Recursion11 {
  public static boolean isSorted(int arr[] , int idx){
    if (idx == arr.length-1) {
      return true;
    }

    if (arr[idx] < arr[idx+1]) {
      return isSorted(arr, idx+1);
    }else {
      return false;
    }
  }
  public static void main(String[] args) {
    int arr[] = {1,3,2,5};
    System.out.println(isSorted(arr, 0));
  }
}
