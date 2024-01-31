package com.gskeno.servletsessioncookie;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

public class CookieSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        System.out.println("session:" + session);
        String id = session.getId();
        System.out.println("session id : " + id);
        Object name = session.getAttribute("name");
        System.out.println("session get name:" + name);
        if (name == null){
            session.setAttribute("name","gaos");
        }


        Enumeration<String> attributeNames = session.getAttributeNames();

        while (attributeNames.hasMoreElements()){
            String s = attributeNames.nextElement();
            System.out.println(s);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
