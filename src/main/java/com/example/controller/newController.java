package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class newController {

    @RequestMapping("/toNew")
    public String toNewPage(Model model) {
        return "new";
    }

}
