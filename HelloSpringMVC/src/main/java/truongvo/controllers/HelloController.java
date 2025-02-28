package truongvo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/chao")
    public ModelAndView chao() {
        ModelAndView modelAndView = new ModelAndView("chao");
        modelAndView.addObject("message", "HELLO SPRING MVC");
        return modelAndView;
    }
}