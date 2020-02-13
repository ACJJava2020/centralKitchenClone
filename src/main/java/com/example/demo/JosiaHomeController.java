package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JosiaHomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/learn")
    public String learn(){
        return "learn";
    }
    @RequestMapping("/volunteer")
    public String volunteer(){
        return "volunteer";
    }
    @RequestMapping("/enroll")
    public String enrol(){
        return "enroll";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("/photogallery")
    public String photogallery(){
        return "photogallery";
    }


}
