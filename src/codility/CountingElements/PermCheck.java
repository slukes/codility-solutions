package codility.countingElements;

public class PermCheck {
  //Solution to https://codility.com/programmers/task/perm_check/
  public int solution(int[] A) {
    int[] bitmap = new int[A.length + 1];
    int counter = A.length;

    for (int eachInt : A) {
      if (eachInt > A.length || bitmap[eachInt] == 1) {
        return 0;
      }

      counter--;
      bitmap[eachInt] = 1;
    }

    return counter == 0 ? 1 : 0;
  }
}
