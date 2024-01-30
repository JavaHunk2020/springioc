package com.ticktick.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//new DogService
@Service
public class DogService {
	
	//you can autowired only bean
	@Autowired
	private EatService  eatService;
	
	public void bark() {
		eatService.eat();
		System.out.println("Hello Dog barks at night!");
	}
	public void walk() {
		eatService.eat();
		System.out.println("Walk!!!!!!!!!!!!!!!!");
	}
}
