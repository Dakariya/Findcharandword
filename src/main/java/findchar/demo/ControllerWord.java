package findchar.demo;

import java.awt.PageAttributes.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/test_services/counter_word/")
public class ControllerWord {

  @Autowired
  private ServiceWord serviceWord;
@GetMapping("/test_service/counter_word/{ss}/{word}")
  public FindWord findWord(@PathVariable("ss") String ss, @PathVariable("word") String word, FindWord findWord){
  findWord.setStr(ss);
  findWord.setWord(word);
  findWord.setCount(ServiceWord.findword(ss, word));
    return findWord;
  }
}
