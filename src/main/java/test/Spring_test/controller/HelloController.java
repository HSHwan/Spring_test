package test.Spring_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "test");
        return "hello";
    }

    @GetMapping("test-mvc")
    public String testMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "test-template";
    }
}
