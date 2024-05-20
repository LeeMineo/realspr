package com.thc.realspr.repository;

import com.thc.realspr.domain.Tbuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository를 확장하므로, Tbuser 엔티티에 대한 기본적인 CRUD 연산이 자동으로 제공됨.
public interface TbuserRepository extends JpaRepository<Tbuser, String> {
}
