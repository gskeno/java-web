package com.gskeno.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 声明为一个控制器
 */
@Controller
public class HomeController {

    /**
     * 处理get请求
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = {"/","/homePage"},method = RequestMethod.GET)
    public String home(HttpServletRequest request, HttpServletResponse response){
        System.out.println("request.getRemoteAddr()" + request.getRemoteAddr());
        System.out.println("request.getRemoteHost()" + request.getRemoteHost());
        System.out.println("request.getRemotePort()" + request.getRemotePort());
        //视图名为home
        return "home";
    }
}
