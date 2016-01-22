import java.util.Arrays;
import java.util.Scanner;

public class CompareString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char [] arr = sc.nextLine().toCharArray();
    int k = sc.nextInt();
    int small = Integer.MAX_VALUE;
    String smallStr = "";
    int big = Integer.MIN_VALUE;
    String bigStr = "";

    for(int i = 0; i < arr.length - (k - 1); i++){
      int value = 0;
      char [] range = Arrays.copyOfRange(arr, i, i + k);
      for(char eachChar : range){
        value += Character.getNumericValue(eachChar);
      }
      if(value > big){
        big = value;
        bigStr = new String(range);
      } else if(value < small){
        small = value;
        smallStr = new String(range);
      }
    }
    System.out.println(smallStr);
    System.out.println(bigStr);
  }
}
