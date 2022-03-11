package findchar.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Converter {

  private final static String baseFile = "char.json";

  public static void toJSON(FindChar findChar) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.writeValue(new File(baseFile), findChar);
    System.out.println("json created!");
  }

  public static FindChar toJavaObject() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.readValue(new File(baseFile), FindChar.class);
  }
}
