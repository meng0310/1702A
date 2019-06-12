package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @RequestMapping("gettlist")
    @ResponseBody
    public String gettlist() {
    	
    	return "listlalala";
    }
}
