package root.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping(value = "/")
    public ModelAndView authorizationPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }

    @PostMapping(value = "/")
    public ModelAndView authorization(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }

    @GetMapping(value = "/registration")
    public ModelAndView registrationPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("reg.html");
        return modelAndView;
    }

    @GetMapping("/test")
    public String test2(Model model){
        System.out.println("hi");
        model.addAttribute("message", "ahahah");
        model.addAttribute("user", new User());
        return "test_page";
    }

    @PostMapping("/test")
    public String test3(@ModelAttribute("user") User user){
        System.out.println(user.getUsername());
        return "redirect:/test";
    }

}
