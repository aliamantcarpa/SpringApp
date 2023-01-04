package root.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping(value = "/")
    public ModelAndView authorizationPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main.html");
        return modelAndView;
    }
}
