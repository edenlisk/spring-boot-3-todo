package com.edenlisk.springboottodo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello. What are you learning today!";
    }


    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer str = new StringBuffer();
        str.append("<html>");
        str.append("<head>");
        str.append("<title>");
        str.append("My first web page");
        str.append("</title>");
        str.append("</head>");
        str.append("<body>Hello World Html from spring boot 3 <strong>controller</strong></body>");
        str.append("</html>");
        return str.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }


}
