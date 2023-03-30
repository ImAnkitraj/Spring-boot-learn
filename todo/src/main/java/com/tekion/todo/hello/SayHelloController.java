package com.tekion.todo.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("/say")
    @ResponseBody
    public String sayHello() {
        return "hello world";
    }

    @RequestMapping("/html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Say hello</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Helo</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("/jsp")
    public String sayHelloJsp() {
        return "hello";
    }
}
