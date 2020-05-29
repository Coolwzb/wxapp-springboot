package com.up;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.up.mapper")
@SpringBootApplication
public class LoginWxApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginWxApplication.class, args);
    }

}
