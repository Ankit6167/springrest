package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entitites.Courses;

public interface CourseService {

	public List<Courses> getCourses();
	
	public Courses getCourses(long courseID);
	
	public Courses addCourses(Courses courses);
}
