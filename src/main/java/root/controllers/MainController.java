package root.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @PostMapping(value = "/test/{superHuevo}")
    public void authorizationPage(@PathVariable String superHuevo ){
        System.out.println(superHuevo);
    }
}
