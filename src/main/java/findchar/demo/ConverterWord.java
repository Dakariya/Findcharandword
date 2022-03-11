package findchar.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ConverterWord {
  private final static String baseFile = "word.json";

  public static void toJSON(FindWord findWord) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.writeValue(new File(baseFile), findWord);
    System.out.println("json created!");
  }

  public static FindWord toJavaObject() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.readValue(new File(baseFile), FindWord.class);
  }
}
