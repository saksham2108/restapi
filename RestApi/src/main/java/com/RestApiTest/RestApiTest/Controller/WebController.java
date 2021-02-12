package com.RestApiTest.RestApiTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @GetMapping
    @RequestMapping(path = "/saveemployee")
    public String SaveEmployee(){
        return "form";
    }

}
