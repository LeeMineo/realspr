package com.thc.realspr.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter // Lombok 라이브러리를 사용하여 모든 필드에 대한 getter 메소드를 자동으로 생성함.
@Entity // JPA를 사용하여 이 클래스의 인스턴스를 데이터베이스 테이블의 레코드로 매핑함.
public class Tbuser {
    @Id private String id; // Id : 이 필드가 테이블의 기본 키임을 나타냄.
    @Setter @Column(nullable = false) private String deleted; // 삭제여부

    @Setter @Column(nullable = false) private String username; // 사용자아이디
    @Setter @Column(nullable = false) private String password; // 비번
    @Setter @Column(nullable = false) private String name;
    @Setter @Column(nullable = false) private String nick;
    @Setter @Column(nullable = false) private String phone;
    @Setter @Column(nullable = false) private String mpic; // 프로필 사진
    @Setter @Column(nullable = false, length=2000000) @Lob private String content; // 본문
    protected Tbuser(){} // JPA 스펙에 따라 기본 생성자는 protected로 선언됨.
    private Tbuser(String username, String password, String name, String nick, String phone, String mpic, String content) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.nick = nick;
        this.phone = phone;
        this.mpic = mpic;
        this.content = content;
    }
    public static Tbuser of(String username, String password){
        return new Tbuser(username, password, "", "", "", "", ""); // 공장 메소드 패턴을 사용하여 Tbuser 인스턴스를 생성함.
    }

    @PrePersist // 데이터베이스에 저장하기 전에 자동으로 호출됨.
    public void onPrePersist() {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.deleted = "N"; // 기본적으로 삭제되지 않음을 설정함.
    }
}
