package com.atlikaixin.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-09-19 10:11
 * @Description : 描述
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.atlikaixin"})
public class EduApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class, args);
    }

}
