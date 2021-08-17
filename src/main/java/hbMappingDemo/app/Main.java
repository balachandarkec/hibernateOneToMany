package hbMappingDemo.app;

import hbMappingDemo.dao.CourseDAO;
import hbMappingDemo.dao.InstructorDAO;
import hbMappingDemo.model.Course;
import hbMappingDemo.model.Instructor;

public final class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstructorDAO instrutorRepo=new InstructorDAO();
		CourseDAO coursedao=new CourseDAO();
		
		
		Course javaFSD=new Course("Java FSD",60);
		Course devops=new Course("devops",60);
		Course aws=new Course("AWS",60);
		
		
		
		
		Instructor instructor1=new Instructor("David","david@mail.com");
		Instructor instructor2=new Instructor("Sumanth","Sumanth@mail.com");
		instrutorRepo.saveInstructor(instructor2);
		instrutorRepo.saveInstructor(instructor1);
		
		
		
		aws.setInstructor(instructor1);
		devops.setInstructor(instructor2);
		aws.setInstructor(instructor2);
		
		coursedao.saveCourse(aws);
		coursedao.saveCourse(devops);

	}

}
