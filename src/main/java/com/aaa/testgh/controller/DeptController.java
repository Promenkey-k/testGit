package com.aaa.testgh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @className:DeptController
 * @discription:
 * @author:ProMonkey-K
 * @creatTime:2018-11-29 09:07
 */
@Controller
@RequestMapping("dept")
public class DeptController {

  @RequestMapping("aaa")
  @ResponseBody
  public Object aaa(){
    return 1111;
  }
}
