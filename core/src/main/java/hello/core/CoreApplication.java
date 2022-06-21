package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Tip)
 menu > preference > gradle > 'build and run' & 'test' > IntelliJ 로 변경
 intelliJ에서 Java를 바로 실행해서 실행 속도 더 빠름
 */

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}
