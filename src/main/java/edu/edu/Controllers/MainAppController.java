package edu.edu.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainAppController {
    @GetMapping("/")
    public String homePage(){
        return "homepage";
    }
}
