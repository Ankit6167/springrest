package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entitites.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseServices;
	
	
	
	@GetMapping("/home")
	public String home() {
		return "welcome to student details";
	}

	@GetMapping("/courses")
	public List<Courses> getCourses() {
				return this.courseServices.getCourses();
		
	}
	
	@GetMapping("/courses/{courseID}")
	public Courses getCourses(@PathVariable String courseID)
	{
		return this.courseServices.getCourses(Long.parseLong(courseID));
		
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses)
	{
		return this.courseServices.addCourses(courses);
		
	}
}
