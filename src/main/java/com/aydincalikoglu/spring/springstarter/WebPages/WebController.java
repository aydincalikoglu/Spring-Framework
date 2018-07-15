package com.aydincalikoglu.spring.springstarter.WebPages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class WebController {

    @RequestMapping("/")
    public String getHomePage() throws IOException {
        return "Index.html";
    }

    /*
    @RequestMapping("/{id}")
    public String getPostByIdHtml( @PathVariable String id) throws IOException {
        return "/resources/Post.html";
    }
    */
}
