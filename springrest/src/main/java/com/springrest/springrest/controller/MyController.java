package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entitites.Courses;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "welcome to student details";
	}

	
	public List<Courses> getCourses() {
		
		
	}
}
