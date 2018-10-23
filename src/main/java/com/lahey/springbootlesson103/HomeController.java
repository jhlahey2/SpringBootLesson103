package com.lahey.springbootlesson103;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This application displays a message from a properties file
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){

        return "hometemplate";
    }
}
