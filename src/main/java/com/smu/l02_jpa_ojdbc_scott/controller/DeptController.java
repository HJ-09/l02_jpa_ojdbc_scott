package com.smu.l02_jpa_ojdbc_scott.controller;

import com.smu.l02_jpa_ojdbc_scott.entity.DeptEntity;
import com.smu.l02_jpa_ojdbc_scott.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/dept") //중간경로. //dept 다 여기로 와 ~ ~
public class DeptController {

    @Autowired
    private DeptRepository deptRepository; //이렇게 쓰기만 하면 주입 받는다구 !?!? ㅇ0ㅇ..

    @GetMapping("/list.do")
    public String list(Model model){ //전달하려면 모델이 필요. 모델역할: 템플릿 엔진에다가 모델을 전달한다고..?
        List<DeptEntity> depts=deptRepository.findAll();
        model.addAttribute("depts",depts);
        return "/dept/list"; //return이 view임..!
    }
}
