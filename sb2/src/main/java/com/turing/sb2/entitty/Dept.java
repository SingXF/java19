package com.turing.sb2.entitty;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="dept")
public class Dept {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自动增长
    @Column(name = "deptno")
    private Integer deptno;
    @Column(name = "dname")
    private String dname;
    @Column(name = "loc")
    private String loc;
}
