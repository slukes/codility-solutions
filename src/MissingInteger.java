public class MissingInteger {
  public int solution(int[] A) {
    int[] bitmap = new int[A.length + 2];

    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0 && A[i] <= A.length) {
        bitmap[A[i]] = 1;
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
