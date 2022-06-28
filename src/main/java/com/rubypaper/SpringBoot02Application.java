package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// @SpringBootApplication = 아래 3개 
@SpringBootConfiguration  // @Configuration 과 동일 (환경설정 클래스) 
@EnableAutoConfiguration  // 두번째 동작 : 스프링에 제공하는 객체 메모리 로딩 (HandlerMapping) = 자동설정 클래스 동작해서 메모리에 뜸 (스프링처럼 xml 빈등록 안해도됨)
@ComponentScan            // 제일 먼저 동작 : 내가 만든 객체 메모리 로딩 (Controller)
public class SpringBoot02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02Application.class, args);   // 웹, 톰캣 라이브러리 추가 안하면 자바로만 실행 가능 -> pom.xml 에 web 스타터 추가 
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/board");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}

// 스프링 컨테이너 2개 -> 객체 두번 생성 (@EnableAutoConfiguration -> @EnableAutoConfiguration)
