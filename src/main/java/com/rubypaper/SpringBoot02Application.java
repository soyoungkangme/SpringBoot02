package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// @SpringBootApplication = 아래 3개 
@SpringBootConfiguration  // = @Configuration (환경설정 클래스) 
@EnableAutoConfiguration  // 두번째 동작 : 스프링이 제공하는 객체 메모리 로딩 (ViewResolver, HandlerMapping, DispatcherServlet 등) 
@ComponentScan            // 제일 먼저 동작 : 내가 만든 객체 먼저 메모리 로딩 (Controller, DAO)
public class SpringBoot02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02Application.class, args);   // 웹, 톰캣 라이브러리 추가 안하면 자바로만 실행 가능 -> pom.xml 에 web 스타터 추가 
	}


    /* 스프링에서 제공하는 객체 내가 빈등록 안해도 @EnableAutoConfiguration(자동설정) 으로 메모리에 자동 로딩 (!= 스프링)
    @Bean  // @Bean은 환경설정 클래스에서 사용 (컨테이너 생성시 메서드 실행)
    ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/board");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
	*/

}

// 스프링 컨테이너 2개 -> 객체 두번 생성(초기화) (@ComponentScan -> @EnableAutoConfiguration)

// 스프링은 수십개의 자동설정 클래스 제공함 (AutoConfiguration 접미사로 붙은 클래스들) => 스프링처럼 환경설정 XML 안만듦 
