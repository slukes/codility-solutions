import java.util.Arrays;

public class Distinct {
  public int solution(int[] A) {
    return (int) Arrays.stream(A)
        .distinct()
        .count();
  }
}
