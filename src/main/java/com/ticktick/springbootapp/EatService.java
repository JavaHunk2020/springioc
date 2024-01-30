package com.ticktick.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EatService {
	
	@Autowired
	private PowerService powerService;
	
	public void eat() {
		System.out.println("Owow it's tasty!!!!!");
		powerService.main();
	}
	
}
