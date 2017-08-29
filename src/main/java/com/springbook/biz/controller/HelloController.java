package com.springbook.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangeun.lee@sk.com
 * @created 2017. 8. 29.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello.do")
    public String hello(Model model) {
        model.addAttribute("helloMessage", "Sprrrrrrrrrrrrrrrrrrring!");
        return "hello";
    }
}
