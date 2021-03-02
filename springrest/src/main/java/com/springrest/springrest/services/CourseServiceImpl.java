package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.entitites.Courses;


public class CourseServiceImpl implements CourseService {

	List<Courses> list;
	
	public CourseServicesImpl() {
		
		list = new ArrayList<>();
		list.add(new Courses(145, "java core courses", "this course contain basic of java"));
		list.add(new Courses(4343, "spring boot", "rest api"));
		
	}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	
}
