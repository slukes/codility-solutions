import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Dequeue {
  static int max;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    Deque<Integer> deque = new ArrayDeque<>(m);
    int[] arr = new int[100_001];
    int c = 0;

    for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      deque.addLast(num);
      arr[num]++;
      if (arr[num] == 1) {
        c++;
      }
      if (deque.size() == m) {
        if (c > max) {
          max = c;
        }
        Integer first = deque.removeFirst();
        arr[first]--;
        if (arr[first] == 0) {
          c--;
        }
      }
    }
    System.out.println(max);
  }

}