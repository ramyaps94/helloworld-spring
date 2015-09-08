package main.java.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloWorld(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        return "helloWorld";
    }

}