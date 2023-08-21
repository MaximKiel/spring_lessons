package org.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class SecondController {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
