package com.explore.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private int duration;
	private double fees;
	private Date validtill;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "courseid", referencedColumnName = "id")
	private List<CourseContent> topics = new ArrayList<>();

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Date getValidtill() {
		return validtill;
	}

	public void setValidtill(Date validtill) {
		this.validtill = validtill;
	}

	public List<CourseContent> getTopics() {
		return topics;
	}

	public void setTopics(List<CourseContent> topics) {
		this.topics = topics;
	}

	public Course()
	{
		
	}
	
	public Course(String name, int duration, double fees, Date validtill) {
		super();
		this.name = name;
		this.duration = duration;
		this.fees = fees;
		this.validtill = validtill;
	}
	
	

}