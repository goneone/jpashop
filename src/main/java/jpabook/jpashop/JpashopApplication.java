package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//스프링부트가 어노테션을 보고 패키지 하위에 있는 모든 얘들을
//컴포넌트 스캔해서 스프링빈으로 자동 등록한다.
public class JpashopApplication {

	public static void main(String[] args) {

	    SpringApplication.run(JpashopApplication.class, args);
	}

}
