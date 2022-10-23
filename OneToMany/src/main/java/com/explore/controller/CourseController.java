package com.explore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.explore.model.Course;
import com.explore.repository.CourseRepository;

@RestController
@RequestMapping("courses")
public class CourseController {
	
	private final CourseRepository courserepository;
	
	@Autowired
	private CourseController(CourseRepository courserepository)
	{
		this.courserepository = courserepository;
	}
	
	@PostMapping(path="/addcourse")
	public Course addCourse(@RequestBody Course course)
	{
		return courserepository.save(course);
	}
	
	@GetMapping(path="/getallcourses")
	public List<Course> getAllCourses()
	{
		return courserepository.findAll();
	}

}
