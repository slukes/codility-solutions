import java.util.LinkedList;
import java.util.List;

public class PassingCars {
  public int solution(int[] A) {
    int [] prefixSums = new int [A.length];
    List<Integer> indexesToCalc = new LinkedList<Integer>();
    prefixSums[0] = A[0];
    if(A[0] == 0){
      indexesToCalc.add(0);
    }

    for(int i = 1; i < A.length; i++){
      if(A[i] == 1){
        prefixSums[i] = prefixSums[i - 1] + 1;
      } else {
        prefixSums[i] = prefixSums[i - 1];
        indexesToCalc.add(i);
      }
    }

    int result = 0;

    for(Integer eachInt : indexesToCalc){
      result += prefixSums[A.length - 1] - prefixSums[eachInt];
      if(result > 1_000_000_000){
        return -1;
      }
    }

    return result;
  }
}
