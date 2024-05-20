package com.thc.realspr.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tbuser") // "/tbuser" 경로로 들어오는 모든 요청은 이 컨트롤러에서 처리될 예정임.
@Controller
public class TbuserPageController {
    @GetMapping("/{page}") // URL에서 "/{page}" 부분은 변수로 처리됨. 예를 들어 "/tbuser/profile"이면 "page"는 "profile"이 됨.
    public String page(@PathVariable("page") String page){
        return "tbuser/" + page;
    } // 반환되는 문자열은 "tbuser/" 디렉토리 아래의 "page" 변수로 지정된 이름의 뷰 파일을 찾아서 렌더링함.
}
