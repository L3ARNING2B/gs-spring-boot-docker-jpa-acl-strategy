package pnepe6.common.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// tag::code[]
@Controller
public class MainController {

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "Kopaxgroup Spring-Boot-Acl-Jpa-Application";
  }

}
// end::code[]