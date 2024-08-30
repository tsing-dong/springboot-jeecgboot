package com.example.springbootjeecgboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.jeecg.modules.jmreport","com.jimureport.demo"})
public class SpringbootJeecgbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJeecgbootApplication.class, args);
	}

}
