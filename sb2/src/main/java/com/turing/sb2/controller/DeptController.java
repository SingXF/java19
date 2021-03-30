package com.turing.sb2.controller;

import com.turing.sb2.dao.DeptRepository;
import com.turing.sb2.entitty.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    //依赖Dao层
    @Autowired
    private DeptRepository repository;

    //查询所有部分信息
    @GetMapping("/dept")
    public List<Dept> list(){
        return repository.findAll();
    }
}
