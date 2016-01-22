import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    Pattern p = Pattern.compile(".*(?:<(.*)\\>)+([^<]*)<\\/\\1>.*");
    while(testCases>0){
      String line = in.nextLine();
      Matcher m = p.matcher(line);
      if(m.find()){
        do{
          String s = m.group(2);
          System.out.println(s.length() > 0 ? s : "None");
        } while(m.find());
      } else {
        System.out.println("None");
      }

      testCases--;
    }
  }
}
