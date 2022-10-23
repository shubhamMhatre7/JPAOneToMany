package com.explore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "coursecontent")
public class CourseContent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String topic;

	public long getId() {
		return id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public CourseContent(String topic) {
		super();
		this.topic = topic;
	}

	public CourseContent() {

	}
}
