package org.example.bootdiary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "블로그에 오신 걸 환영함당 🤗");
        model.addAttribute("message", "저는 엄청난 개발자임당 🤪");
        model.addAttribute("frontImage", "https://raw.githubusercontent.com/qus0in/boot-diary/a3de9973abd7f9a840f18e1d1fb734dfc34ae1c6/src/main/resources/static/assets/dino.jpeg");
        return "index";
    }
}
