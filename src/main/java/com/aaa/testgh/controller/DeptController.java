package com.aaa.testgh.controller;

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
  public object aaa(){
    return 1111;
  }
}
