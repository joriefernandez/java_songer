package com.fern.j.project.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotRestController {

    @GetMapping("/notresthello")
    public String getHello(){
        return "hello";
    }

}
