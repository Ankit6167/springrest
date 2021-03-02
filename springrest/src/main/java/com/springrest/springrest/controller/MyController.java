package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entitites.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	private CourseService courseServices;
	
	
	
	@GetMapping("/home")
	public String home() {
		return "welcome to student details";
	}

	@GetMapping("/courses")
	public List<Courses> getCourses() {
		
		
		return this.courseServices.getCourses();
		
	}
}
