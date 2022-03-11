package findchar.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class FindChar {

  @JsonProperty("inputString")
  private String str;

  @JsonProperty("recurringCharacters")
  private Map<Character, Integer> map;

  public FindChar(String str, Map<Character, Integer> map) {
    this.str = str;
    this.map = map;
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public Map<Character, Integer> getMap() {
    return map;
  }

  public void setMap(Map<Character, Integer> map) {
    this.map = map;
  }
}
