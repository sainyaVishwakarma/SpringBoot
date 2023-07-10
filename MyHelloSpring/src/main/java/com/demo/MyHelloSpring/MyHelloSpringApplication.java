package com.demo.MyHelloSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyHelloSpringApplication {

	public static void main(String[] args) {
//		ApplicationContext ctx=SpringApplication.run(MyHelloSpringApplication.class, args);
//		int i=0;
//		for(String name:ctx.getBeanDefinitionNames()) {
//			i++;
//			System.out.println(name);
//		}
//		System.out.println("count = "+i);
		
		SpringApplication.run(MyHelloSpringApplication.class, args);
	}

}
