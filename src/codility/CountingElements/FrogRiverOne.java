package codility.countingElements;

public class FrogRiverOne {
  //Solution to https://codility.com/programmers/task/frog_river_one/.  Score 100%
  public int solution(int X, int[] A) {
    int[] bitmap = new int[X + 1];
    for (int i = 0; i < A.length; i++) {
      if (bitmap[A[i]] != 1) {
        X--;
        if (X == 0) {
          return i;
        }

        bitmap[A[i]] = 1;
      }
    }
    return -1;
  }
}
