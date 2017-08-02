package com.springbook.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"applicationContext.xml"})
public class MainApplication {

    public static void main(String[] args) {
        // 1. Spring 컨테이너를 구동한다. (with Spring Boot)
        ApplicationContext container = SpringApplication.run(MainApplication.class, args);

        // 2. ...
    }
}
