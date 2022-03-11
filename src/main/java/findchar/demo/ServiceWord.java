package findchar.demo;

import java.util.Locale;

@org.springframework.stereotype.Service
public class ServiceWord {

  public static int findword(String ss, String word){
    ss.toLowerCase(Locale.ROOT);
    word = "check";
    int indword;
    int curInd = 0;
    int count = 0;
    while ((indword = ss.indexOf(word,curInd)) != -1) {
      count++;
      curInd = indword + 1;
    }
    return count;
  }

}
