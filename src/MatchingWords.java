import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sam Lukes on 12/01/16.
 */
public class MatchingWords {
  public static void main(String[] args){

    String pattern = "\\b(\\w+)(?:\\s+\\1\\b)+";
    Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

    Scanner in = new Scanner(System.in);
    int testCases = 1;
    while(testCases>0){
      String input = "GoodBye bye bye world world world\n";
      Matcher m = r.matcher(input);
      boolean findMatch = true;
      while(m.find()){
        System.out.println(m.group());
        input = input.replaceAll(m.group(), m.group(1));
        findMatch = false;
      }
      System.out.println(input);
      testCases--;
    }
  }
}
