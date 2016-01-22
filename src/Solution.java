import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
  /* Head ends here */
  public static void findStrings(String[] a, int[] query) {
    List<String> substrings = new ArrayList<>();
    Arrays.stream(a).forEach(
        (str) ->
        {
          for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
              substrings.add(str.substring(i, j));
            }
          }
        }
    );

    final List<String> sortedList = substrings.stream().parallel().distinct().sorted().collect(Collectors.toList());
    final int size = sortedList.size();

    Arrays.stream(query).forEach(
        k ->
        {
          if (k > size) {
            System.out.println("INVALID");
          } else {
            System.out.println(sortedList.get(k - 1));
          }
        }
    );
  }

  /* Tail starts here */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int _cases = Integer.parseInt(in.nextLine());
    String[] _a = new String[_cases];

    for (int _a_i = 0; _a_i < _cases; _a_i++) {
      _a[_a_i] = in.nextLine();
    }
    int _query = Integer.parseInt(in.nextLine());
    int[] query = new int[_query];
    for (int _a_i = 0; _a_i < _query; _a_i++) {
      query[_a_i] = Integer.parseInt(in.nextLine());
    }

    findStrings(_a, query);
  }
}
