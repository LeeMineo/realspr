package com.thc.realspr.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DefaultPageController {
    @GetMapping({"","/","/index"})
    // 이 메소드는 웹 브라우저에서 루트 URL이나 "/index"로 접근했을 때 "index"라는 뷰를 보여주는 역할을 함.
    public String index(){
        return "index";
    }
/*

    @GetMapping("/{page}")
    public String page(@PathVariable("page") String page){
        return "tbbanner/" + page;
    }
*/

}
