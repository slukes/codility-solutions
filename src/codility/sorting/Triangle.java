package codility.sorting;

public class Triangle {
  public int solution(int[] A) {
   if(A != null || A.length >= 3){
     for(int i = 0; i < A.length - 2; i++){
       if(A[i] >= 0 && A[i] < A[i + 1] && A[i + 1] < A[i + 2]){
         return 1;
       }
     }
   }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(new Triangle().solution(new int[]{10, 2, 5, 1, 8, 20}));
    System.out.println(new Triangle().solution(new int[]{10, 50, 5, 1}));
  }
}
