package com.thc.realspr.controller;

import com.thc.realspr.repository.TbuserRepository;
import com.thc.realspr.service.TbuserService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api/tbuser") // 이 컨트롤러의 모든 메소드는 "/api/tbuser" 경로로 요청될 것임.
@RestController
public class TbuserController {

    private final TbuserService tbuserService;// 서비스 계층의 인스턴스를 주입받음. 비즈니스 로직을 처리하기 위해 사용됨
    public TbuserController(
            TbuserService tbuserService   // 생성자를 통해 TbuserService를 주입받음
    ) {
        this.tbuserService = tbuserService;
    }

    @PostMapping("") // POST 메소드로 "/api/tbuser"에 요청이 오면 이 메소드가 호출됨.
    public Map<String, Object> create(@RequestBody Map<String, Object> param){
        System.out.println(param);  // 요청으로 받은 파라미터를 콘솔에 출력함.
        return tbuserService.create(param); // 서비스 계층의 create 메소드를 호출하여 비즈니스 로직을 처리하고 결과를 반환함.
    }
    @PutMapping("") // PUT 메소드로 "/api/tbuser"에 요청이 오면 이 메소드가 호출됨.
    //RequestBody 는 요청을 받는것. Map형태의 param을 받음.
    public Map<String, Object> update(@RequestBody Map<String, Object> param){
        System.out.println(param); // 요청으로 받은 파라미터를 콘솔에 출력함.
        return tbuserService.update(param); // 서비스 계층의 update 메소드를 호출하여 비즈니스 로직을 처리하고 결과를 반환함.
    }
    @GetMapping("/get/{id}") // GET 메소드로 "/api/tbuser/get/{id}"에 요청이 오면 이 메소드가 호출됨.
    public Map<String, Object> detail(@PathVariable("id") String id){
        System.out.println(id); // URL 경로에서 추출한 id 값을 콘솔에 출력함.
        return tbuserService.get(id); // 서비스 계층의 get 메소드를 호출하여 비즈니스 로직을 처리하고 결과를 반환함.
    }
}
