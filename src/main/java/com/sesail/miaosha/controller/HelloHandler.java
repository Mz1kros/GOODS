package com.sesail.miaosha.controller;

import com.sesail.miaosha.result.CodeMsg;
import com.sesail.miaosha.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/demo")
public class HelloHandler {
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping("/db/get")
    @ResponseBody
    public Result<String> dbGet(){
        return Result.error(CodeMsg.SERVER_ERROR);
    }

}
