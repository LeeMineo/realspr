package com.thc.realspr.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tbuser") //여기에 요청이 들어올것이다.
@Controller
public class TbuserPageController {
    @GetMapping("/{page}") //중괄호는 변수이다.
    public String page(@PathVariable("page") String page){
        return "tbuser/" + page;
    }
}
