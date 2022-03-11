package findchar.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Service

public class Service {

  public static boolean ifEquals ( char a, char b){
  return a == b;
}
  public static int recursiveMethod ( char[] charAr, int i, int count){
    if (ifEquals(charAr[i - 1], charAr[i])) {
      count = count + recursiveMethod(charAr, ++i, count);
    }
    return count;
  }
  public static Map <Character, Integer> findchar(String str) {
    Map<Character, Integer> map = new HashMap<>();
    str=str.toLowerCase();
    char[] charAr = str.toCharArray();
    Arrays.sort(charAr);
    for (int i = 1; i < charAr.length; ) {
      int count = 0;
      count = count + recursiveMethod(charAr, i, 1);
      if (count > 1) {
        map.put(charAr[i], count);

        i = i + count;
      } else
        i++;
    }
    return map;
  }
  }