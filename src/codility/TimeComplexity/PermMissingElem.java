package codility.timeComplexity;

import java.util.Arrays;

public class PermMissingElem {
  //Solution to https://codility.com/programmers/task/perm_missing_elem/.  100%
  public static int solution(int[] A) {
    return ((A.length + 1) * (A.length + 2)) / 2 - Arrays.stream(A).sum();
  }
}
