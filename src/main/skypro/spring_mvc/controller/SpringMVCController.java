package spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/skypro")
public class SpringMVCController {
    @RequestMapping("/enterInfo")
    public String getEnterView() {
        return "enter";
    }

    @RequestMapping("/showInfo")
    public String getShowView() {
        return "show";
    }
}
