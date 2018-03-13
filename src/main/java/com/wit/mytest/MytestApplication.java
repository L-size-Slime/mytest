package com.wit.mytest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wit.mytest.mapper")
public class MytestApplication {
	public static void main(String[] args) {
		SpringApplication.run(MytestApplication.class, args);
	}
}
