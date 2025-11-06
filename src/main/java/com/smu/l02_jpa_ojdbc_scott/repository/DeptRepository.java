package com.smu.l02_jpa_ojdbc_scott.repository;

//구현이 덜 되어 있어야 JPA한테 맡길 수 있으니 class 안되고, interface로!

import com.smu.l02_jpa_ojdbc_scott.entity.DeptEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//CrudRepository ⇒ 심플함. CRUD만 有
//JpaRepository ⇒ 구체적(페이징)
@Repository
public interface DeptRepository extends JpaRepository<DeptEntity,Integer> { //제네릭(무조건 자료형만 사용가능)... 모라고?
    //ㅁㅔ서드 쿼리 만들게. 근데 조회는 안하고 order는 할거야. id 역순으로!
    List<DeptEntity> findAllByOrderByIdDesc();
    //loc 부서위치 부서를 조회 ⇒ SELECT * FROM dept WHERE loc=?
    List<DeptEntity> findByLoc(String loc); //loc가 pk나 uk 아니니까 List로 받는거임.

    //부서이름이나 부서위치가 같은 부서를 조회 ⇒ SELECT * FROM dept WHERE loc=? AND dname=?
    List<DeptEntity> findByLocAndDname(String loc, String dname);

}
