package hbMappingDemo.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_course")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	@Column(name="title")
	private String name;
	private int duration;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_id")
	private Instructor instructor;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Instructor getInstructor() {
		return instructor;
	}




	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}




	public Course(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
	}




	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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
	
	
	
	
	

}
