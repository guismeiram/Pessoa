package br.com.contabilidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ContabilidadeApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ContabilidadeApplication.class, args);
	}

}
