package com.turing.sb2.entitty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
@Data   //这个注解包含get和set和toString三个方法
//@Getter
//@Setter
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
