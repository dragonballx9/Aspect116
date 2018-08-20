package com.wellsfargo.tv;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableAutoConfiguration
public class TVBootApplication {//{extends SpringBootServletInitializer{

	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		 //TODO Auto-generated method stub
		//return super.configure(builder);
		
		
		return builder.sources(TVBootApplication.class, TVBootConfiguration.class);
		
	}
	
	public static void main(String[] args) {
	       
		System.setProperty("spring.devtools.restart.enabled", "true");
		SpringApplication.run(TVBootApplication.class, args);
    }
	
	
}
