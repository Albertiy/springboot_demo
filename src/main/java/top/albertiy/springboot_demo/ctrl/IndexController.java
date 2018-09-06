package top.albertiy.springboot_demo.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {
    @RequestMapping("/")
    public String defaultPage() {
        System.out.println("home");
        return "redirect:/home";
    }

    @RequestMapping("/index")
    public String indexPage() {
        System.out.println("home");
        return "home";
    }

    @RequestMapping("/home")
    public String homePage() {
        System.out.println("home");
        return "home";
    }
}
