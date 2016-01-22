public class Nesting {
  public int solution(String S) {
    int openingBracks = 0;
    for (Character eachBrack : S.toCharArray()) {
      if (eachBrack == '(') {
        openingBracks++;
      } else {
        if (openingBracks < 1) {
          return 0;
        }
        openingBracks--;
      }
    }
    return openingBracks == 0 ? 1 : 0;
  }
}
