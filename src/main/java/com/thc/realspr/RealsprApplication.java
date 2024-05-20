package com.thc.realspr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 이 어노테이션은 스프링 부트 애플리케이션의 시작 지점을 나타냄.
public class RealsprApplication {

    // 스프링 부트 애플리케이션을 실행하는 메소드.
    public static void main(String[] args) {
        SpringApplication.run(RealsprApplication.class, args);
    }

}
