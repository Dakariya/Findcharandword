package findchar.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class FindWord {

  @JsonProperty("inputString")
  private String str;

  @JsonProperty("inputword")
  private String word;

  @JsonProperty("countWords")
  private int count;

  public FindWord() {
  }

  public FindWord(String str, String word, int count) {
    this.str = str;
    this.word = word;
    this.count = count;
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
