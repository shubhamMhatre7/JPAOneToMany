package com.explore.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.explore.model.CourseContent;


public interface CourseContentRepository extends JpaRepository<CourseContent, Long> {

	public List<CourseContent> findByCourseid(long courseid);
}
