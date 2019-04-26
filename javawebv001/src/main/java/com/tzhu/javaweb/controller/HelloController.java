package com.tzhu.javaweb.controller;

/**
 * desc:
 * author : tzhu
 * time :2019-04-26
 * version: 1.2.3
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

/**
 * 测试demo的controller
 *
 * @author zcc ON 2018/2/8
 **/
@Controller
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    public HelloController() {
        System.out.println("spring mvc is ok...........................................");
    }

    @RequestMapping("/thy")
    public ModelAndView hello() {

        ModelAndView  model=new ModelAndView("hello");
        System.out.println("hello.........................");

        model.addObject("name","tzhu");
        model.addObject("aaa","tzhu");
        return model;
    }
}