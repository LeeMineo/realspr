package com.thc.realspr.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service // 이 인터페이스가 서비스 계층의 빈으로 등록됨을 나타냄.
public interface TbuserService {
    // 사용자 생성 메소드. 주어진 파라미터를 받아 새로운 사용자를 생성하고, 결과를 반환함.
    public Map<String, Object> create(Map<String, Object> param);
    // 사용자 업데이트 메소드. 주어진 파라미터를 받아 기존 사용자를 업데이트하고, 결과를 반환함.
    public Map<String, Object> update(Map<String, Object> param);
    // 사용자 조회 메소드. 주어진 ID를 받아 해당 사용자의 정보를 조회하고, 결과를 반환함.
    public Map<String, Object> get(String id);
}
