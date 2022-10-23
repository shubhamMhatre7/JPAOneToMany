package com.explore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.explore.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
	
}