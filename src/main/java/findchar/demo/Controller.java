package findchar.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Autowired
  private Service service;

  @GetMapping("/test_service/duplicate_characters/{str}")
  public FindChar findChar(@PathVariable String str, FindChar findChar){
    findChar.setStr(str);
    findChar.setMap(Service.findchar(str));
    return findChar;

  }
  //
  @GetMapping("/message/{string}")
  public String find(@PathVariable  String string){
    return string;
  }
}
