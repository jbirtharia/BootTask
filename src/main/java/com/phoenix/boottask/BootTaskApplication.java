package com.phoenix.boottask;

import com.phoenix.boottask.entity.Application;
import com.phoenix.boottask.repository.ApplicationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootTaskApplication {

	public static void main(String[] args) {SpringApplication.run(BootTaskApplication.class, args);}

	@Bean
	public CommandLineRunner demo(ApplicationRepository repository){
		return args -> {
			//repository.save(new Application("ESB","Narmeet","Developed"));
			//repository.save(new Application("Journey","Lalit","Developed"));
			//repository.save(new Application("Portal","Joel","Developed"));
			repository.findAll().forEach(System.out::println);
		};
	}
}
