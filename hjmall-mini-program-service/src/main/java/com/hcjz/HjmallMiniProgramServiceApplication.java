package com.hcjz;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan(basePackages = "com.hcjz.mapper")
//@ComponentScan(basePackages = "com.hcjz.service")
@EnableDubbo
//@EnableWebMvc
public class HjmallMiniProgramServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HjmallMiniProgramServiceApplication.class, args);
    }



}
