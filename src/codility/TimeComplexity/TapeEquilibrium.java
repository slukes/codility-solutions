package codility.timeComplexity;

import java.util.Arrays;

public class TapeEquilibrium {
  //Solution to https://codility.com/programmers/task/tape_equilibrium/.  100%
  public static int solution(int[] A) {
    int leftTotal = Arrays.stream(A).sum();
    int rightTotal = 0;
    int answer = 100000;

    for (int i = 0; i < A.length - 1; i++) {
      rightTotal += A[i];
      leftTotal -= A[i];

      answer = Math.min(answer, Math.abs(rightTotal - leftTotal));
    }

    return answer;
  }
}
