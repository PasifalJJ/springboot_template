package com.jsc;

//import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@ComponentScan({"com.jsc"})
@MapperScan(basePackages = {"com.jsc.mapper"})
public class App {
    public static void main(String[] args) {
        //启动springboot项目
        SpringApplication.run(App.class,args);
    }
}
