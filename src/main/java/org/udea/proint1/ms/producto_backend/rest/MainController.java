package org.udea.proint1.ms.producto_backend.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @RequestMapping("/index")
  @ResponseBody
  public String index() {
    return "Developed by UdeA ";
  }

}