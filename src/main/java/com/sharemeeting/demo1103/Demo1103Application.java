package com.sharemeeting.demo1103;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@SpringBootApplicationexclude=({SecurityAutoConfiguration.class})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan(basePackages = "com.sharemeeting.demo1103.mapper")
public class Demo1103Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1103Application.class, args);
    }

}
