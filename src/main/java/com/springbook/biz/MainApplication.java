package com.springbook.biz;

import com.springbook.biz.common.Tv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"applicationContext.xml"})
public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MainApplication.class, args);

        Tv samsungTv = (Tv) applicationContext.getBean("samsungTv");
        samsungTv.powerOn();
    }
}
