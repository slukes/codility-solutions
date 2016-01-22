/**
 * Created by Sam Lukes on 23/11/2015.
 */
public class Main {
  public static void main(String[] args) {
    System.getenv().forEach((k, v) -> System.out.println(k + "  :  " + v));
    System.console();
    System.out.println("");
  }
}
