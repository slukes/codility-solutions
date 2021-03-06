package codility.stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;


public class Brackets {
  //Solution to https://codility.com/programmers/task/brackets/. 100%
  public int solution(String S) {
    if (S.length() % 2 != 0) {
      return 0;
    }
    Deque<Character> bracketStack = new ArrayDeque<>();
    for (char eachChar : S.toCharArray()) {
      if (eachChar == '(' || eachChar == '{' || eachChar == '[') {
        bracketStack.addFirst(eachChar);
      } else if (bracketStack.size() < 1) {
        return 0;
      } else {
        switch (eachChar) {
          case ')':
            if (bracketStack.removeFirst() != '(') {
              return 0;
            }
            break;
          case '}':
            if (bracketStack.removeFirst() != '{') {
              return 0;
            }
            break;
          case ']':
            if (bracketStack.removeFirst() != '[') {
              return 0;
            }
        }
      }
    }

    return bracketStack.size() == 0 ? 1 : 0;
  }
}

