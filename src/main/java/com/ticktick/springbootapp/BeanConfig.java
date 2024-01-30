package com.ticktick.springbootapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	//Hey object you will be treated as bean
	@Bean
	public PowerService getIntance() {
		return new PowerService();
	}
	
}
