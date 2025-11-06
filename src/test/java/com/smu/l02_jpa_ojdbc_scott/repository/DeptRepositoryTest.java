package com.smu.l02_jpa_ojdbc_scott.repository;

import com.smu.l02_jpa_ojdbc_scott.entity.DeptEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

//빈팩토리
@SpringBootTest
class DeptRepositoryTest {
    @Autowired //컴포넌트만 할 수 잇슴
    DeptRepository deptRepository;
    @Test
    void findByAll() throws Exception {
        List<DeptEntity> depts = deptRepository.findAll();
        System.out.println(depts);
    }

    @Test
    void findAllByOrderByIdDesc() {
        System.out.println(deptRepository.findAllByOrderByIdDesc());
    }

    @Test
    void findByLoc() {
        System.out.println(deptRepository.findByLoc("BOSTON"));
    }

    @Test
    void findByLocAndDname() {
        System.out.println(deptRepository.findByLocAndDname("NEW YORK", "ACCOUNTING"));
    }

    @Test //저장해볼게
    void save() throws Exception {
        DeptEntity deptEntity = new DeptEntity();
        deptEntity.setId(99);
        deptEntity.setDname("BACK");
        deptEntity.setLoc("BUSAN");

        DeptEntity saveDept=deptRepository.save(deptEntity);
        System.out.println(saveDept);
//        System.out.println(deptRepository.findById(99));
        //└─ 이렇게 쓰면 Optional을 반환할거임. 존재하는지 아닌지! 그래서 이렇게 쓰면 안댐
        Optional<DeptEntity> deptOpt=deptRepository.findById(99);
        deptOpt.ifPresent(d->System.out.println("성공? "+d));
    }
}