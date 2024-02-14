package me.heng.vitrualthread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="me.heng")
public class VitrualthreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(VitrualthreadApplication.class, args);
	}

}
