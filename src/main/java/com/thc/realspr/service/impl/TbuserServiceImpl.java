package com.thc.realspr.service.impl;

import com.thc.realspr.domain.Tbuser;
import com.thc.realspr.repository.TbuserRepository;
import com.thc.realspr.service.TbuserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service // 이 클래스가 서비스 계층(비즈니스 로직을 구현하는 부분임)의 빈(스프링 컨테이너로부터 주입(Dependency Injection) 받을 수 있음.)으로 등록됨을 나타냄. 즉 서비스 역할을 한다.
public class TbuserServiceImpl implements TbuserService {

    private final TbuserRepository tbuserRepository; // 리포지토리를 통해 데이터베이스와 상호작용
    public TbuserServiceImpl(
            TbuserRepository tbuserRepository
    ) {
        this.tbuserRepository = tbuserRepository; // 생성자를 통해 TbuserRepository를 주입
    }

    public Map<String, Object> create(Map<String, Object> param){
        Map<String, Object> returnMap = new HashMap<String, Object>(); // 결과를 저장할 맵 생성.
        System.out.println(param); // 요청으로 받은 파라미터를 콘솔에 출력함.
        // 요청 파라미터에서 username과 password를 가져와 Tbuser 객체를 생성함
        Tbuser tbuser = Tbuser.of(param.get("username") + "", param.get("password") + "");
        // 생성된 Tbuser 객체를 데이터베이스에 저장함.
        tbuserRepository.save(tbuser);
        // 결과 맵에 저장된 Tbuser의 ID를 추가함.
        returnMap.put("id", tbuser.getId());
        return returnMap;
    }
    public Map<String, Object> update(Map<String, Object> param){
        Map<String, Object> returnMap = new HashMap<String, Object>(); // 결과를 저장할 맵 생성.
        System.out.println(param);
        // 요청 파라미터에서 ID를 가져와 해당 ID의 Tbuser 객체를 찾음. 찾지 못하면 Exception 발생시킴.
        Tbuser tbuser = tbuserRepository.findById(param.get("id") + "").orElseThrow(() -> new RuntimeException(""));
        // 파라미터에 name이 포함되어 있으면 해당 값을 설정함.
        if(param.get("name") != null) {
            tbuser.setName(param.get("name") + "");
        }
        // 파라미터에 nick이 포함되어 있으면 해당 값을 설정함.
        if(param.get("nick") != null) {
            tbuser.setNick(param.get("nick") + "");
        }
        // 파라미터에 phone이 포함되어 있으면 해당 값을 설정함.
        if(param.get("phone") != null) {
            tbuser.setPhone(param.get("phone") + "");
        }

        // 변경된 Tbuser 객체를 데이터베이스에 저장함.
        tbuserRepository.save(tbuser);
        // 결과 맵에 저장된 Tbuser의 ID를 추가함.
        returnMap.put("id", tbuser.getId());
        return returnMap;
    }
    public Map<String, Object> get(String id){
        Map<String, Object> returnMap = new HashMap<String, Object>();
        System.out.println(id); // 요청으로 받은 ID를 콘솔에 출력함.
        // 요청 ID로 Tbuser 객체를 찾음. 찾지 못하면 Exception 발생시킴.
        Tbuser tbuser = tbuserRepository.findById(id).orElseThrow(() -> new RuntimeException(""));

        // 결과 맵에 Tbuser 객체의 정보를 추가함.
        returnMap.put("id", tbuser.getId());
        returnMap.put("username", tbuser.getUsername());
        returnMap.put("name", tbuser.getName());
        returnMap.put("nick", tbuser.getNick());
        returnMap.put("phone", tbuser.getPhone());

        return returnMap; // 결과 맵을 반환함.
    }
}
