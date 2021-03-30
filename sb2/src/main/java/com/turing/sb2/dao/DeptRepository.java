package com.turing.sb2.dao;

import com.turing.sb2.entitty.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept,Integer> {
}
