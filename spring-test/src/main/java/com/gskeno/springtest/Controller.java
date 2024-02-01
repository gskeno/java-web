package com.gskeno.springtest;

import com.gskeno.beanconfig1.Library;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@RestController
public class Controller {

    /**
     * 处理get请求
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = {"/"},method = RequestMethod.GET)
    public String home(HttpServletRequest request, HttpServletResponse response){
        Library bean = AppBeans.getBean(Library.class);
        System.out.println(bean);
        String[] beanDefinitionNames = AppBeans.getContext().getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::print);
        return "hello";
    }
}
