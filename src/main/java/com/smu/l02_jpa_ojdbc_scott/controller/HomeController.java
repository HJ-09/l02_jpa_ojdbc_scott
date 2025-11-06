package com.smu.l02_jpa_ojdbc_scott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Controller //컴포넌트(=스프링에서 자동관리(BeanFactory) 되는 객체의 타입)
//컴포넌트 스캔: 스프링이 처음 생성된 패키지 하위(자식)에 존재하는 컴포넌트를 자동으로 찾아서 관리(빈 팩토리)해줌. ==Singleton
public class HomeController {
    //스프링 빈팩토리에서 생성된 객체를 주입받을게 ~
    @Autowired
    private DataSource dataSource; //이 친구가 connection을 반환햐
    // 객체 지향 문법 ⇒ 객체가 필요하면 생성 → 일반적인 흐름
    // 객체 지향 문법 ⇒ 만들어진 객체 주입 → 제어가 역전(Inversion of Control, Dependency Injection)


    @GetMapping("/")
    public String index() throws SQLException {
        /*Connection conn = dataSource.getConnection();
        System.out.println(conn);
        Statement sm = conn.createStatement();
        ResultSet rs = sm.executeQuery("SELECT * FROM EMP");
        while (rs.next()) {
            System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3));
        }*/ //데이터 소스를 받아서 출력이 되나 확인해봣서용~


        return "index";
    }
}


