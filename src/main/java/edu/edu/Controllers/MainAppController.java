package edu.edu.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping
public class MainAppController {
    @GetMapping("/")
    public String homePage(){
        return "homePage";
    }
    @GetMapping("rejestracja")
    public String rejestracja(){
        return "registrationForm";
    }
}
