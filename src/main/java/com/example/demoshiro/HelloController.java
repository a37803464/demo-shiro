package com.example.demoshiro;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Win
 * @create 2018-07-17 10:33
 */
@Controller
@RequestMapping("say")
public class HelloController {

  @RequestMapping("/")
  @ResponseBody
  public String say() {
    System.out.println("in");
    return "hello," + new Date().toLocaleString();
  }
}
