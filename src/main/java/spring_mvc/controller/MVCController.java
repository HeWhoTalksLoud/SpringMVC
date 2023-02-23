package spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/skypro")
public class MVCController {
    @RequestMapping("/enterInfo")
    public String getEnterView() {
        return "enterInfo";
    }

    @RequestMapping("showInfo")
    public String getShowView() {
        return "showInfo";
    }
}