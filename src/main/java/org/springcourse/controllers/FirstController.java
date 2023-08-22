package org.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

//        System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("massage", "Hello, " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int a,
                            @RequestParam int b,
                            @RequestParam String action,
                            Model model) {
        int result;
        switch (action) {
            case "multiplication" -> result = a * b;
            case "addition" -> result = a + b;
            case "subtraction" -> result = a - b;
            case "division" -> result = a / b;
            default -> throw new IllegalStateException("Unexpected value: " + action);
        }
        model.addAttribute("result", "Calculation result = " + result);
        return "first/calculator";
    }
}
