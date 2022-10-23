package com.explore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.explore.model.CourseContent;
import com.explore.repository.CourseContentRepository;

@RestController
@RequestMapping("coursecontent")
public class CourseContentController {
	
	private final CourseContentRepository coursecontentrepository;
		
	
	@Autowired
	private CourseContentController(CourseContentRepository coursecontentrepository)
	{
		this.coursecontentrepository = coursecontentrepository;
	}
	
	@GetMapping(path="/getallcontent")
	public List<CourseContent> getAllContent()
	{
		return coursecontentrepository.findAll();
	}
}