package com.smu.l02_jpa_ojdbc_scott.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //얘도 컴포너트 하위
//└─ 이제 스프링에서 관리하는거 아니고 spring-JPA(jap에서 객체를 관리하는 팩토리가 따로 존재함)에서 관리 Go

@Table(name = "DEPT") //테이블은 DEPT인데 클래스명은 DEPT 아니니까 이렇게 적어줌
public class DeptEntity {
    @Id //pk가 잇ㄷㅏ고 알려주는겨. 만약 pk 없으면 만들어야 함. 아마도..
    @Column(name = "deptno") //②id가 deptno라고 알려줄게~
    private int id; //①deptno 대신 id를 써볼게
    private String dname;
    private String loc;


    @Override
    public String toString() {
        return "DeptEntity{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                "}\n";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
