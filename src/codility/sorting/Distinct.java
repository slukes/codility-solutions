package codility.sorting;

import java.util.Arrays;

public class Distinct {
  //Solution to https://codility.com/programmers/task/distinct/.
  //Made very elegant by Java 1.8
  public int solution(int[] A) {
    return (int) Arrays.stream(A)
        .distinct()
        .count();
  }
}
