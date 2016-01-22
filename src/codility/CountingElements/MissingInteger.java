package codility.countingElements;

public class MissingInteger {
  //Solution to https://codility.com/programmers/task/missing_integer/
  public int solution(int[] A) {
    int[] bitmap = new int[A.length + 2];

    for (int eachInt : A) {
      if (eachInt > 0 && eachInt <= A.length) {
        bitmap[eachInt] = 1;
      }
    }

    for (int i = 1; i < bitmap.length; i++) {
      if (bitmap[i] == 0) {
        return i;
      }
    }

    return -1;
  }
}
