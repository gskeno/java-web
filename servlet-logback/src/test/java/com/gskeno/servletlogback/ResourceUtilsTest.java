package com.gskeno.servletlogback;

import org.junit.Test;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;

public class ResourceUtilsTest {

    @Test
    public void test() throws FileNotFoundException {
        String resolvedLocation = "classpath:logback2.xml";
        URL url = ResourceUtils.getURL(resolvedLocation);
        System.out.println(url);
    }
}
