package com.my.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/2/8.
 */
@Controller
public class MyController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(Model model) {
        return "hello";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printIndex(Model model) {
        return "index";
    }
}
