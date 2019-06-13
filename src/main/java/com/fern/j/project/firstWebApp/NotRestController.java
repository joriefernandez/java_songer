package com.fern.j.project.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotRestController {

    @GetMapping("/notresthello")
    public String getHello(Model m){
        String[] allTheNames = new String[]{"Michelle", "Evan", "reina"};
        m.addAttribute("names", allTheNames);
        return "hello";
    }

}
