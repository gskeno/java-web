package com.gskeno.springtest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;
import java.util.Arrays;

public class BaseTest {

    /**
     * 注意classpath*:与classpath:
     */
    @Test
    public void testClassPathXmlApplicationContext(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:common-bean.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);

    }

    @Test
    public void test(){
        URL resource = getClass().getClassLoader().getResource("common-bean.xml");
        System.out.println(resource);
    }
}
