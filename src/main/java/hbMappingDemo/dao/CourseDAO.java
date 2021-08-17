package hbMappingDemo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hbMappingDemo.config.HibernateConfig;
import hbMappingDemo.model.Course;


public class CourseDAO {
	
	public void saveCourse(Course course) {
		Transaction trans=null;
    	try(Session session=HibernateConfig.getSessionFactory().openSession()){
    		trans=session.beginTransaction();
    		session.save(course);
    		
    		trans.commit();
    		
    	}catch(Exception e) {
    		if(trans!=null) {
    			trans.rollback();
    		}
    		e.printStackTrace();
    	}
	}
	
    
 public void updateCourse(Course course) {

 	Transaction trans=null;
 	try(Session session=HibernateConfig.getSessionFactory().openSession()){
 		trans=session.beginTransaction();
 		session.update(course);
 		
 		trans.commit();
 		
 	}catch(Exception e) {
 		if(trans!=null) {
 			trans.rollback();
 		}
 		e.printStackTrace();
 	}
    	
    }
 
 
public void deleteCourse(int id) {
	Transaction trans=null;
	
	try(Session session=HibernateConfig.getSessionFactory().openSession()){
 		trans=session.beginTransaction();
 		Course target=session.get(Course.class, id);
 		if(target !=null) {
 			session.delete(target);
 			System.out.println("Target Object Deleted");
 		}
 		 trans.commit();
 		
 		
 	}catch(Exception e) {
 		if(trans!=null) {
 			trans.rollback();
 		}
 		e.printStackTrace();
 	}
  	
  }
   

public Course getCourseById(int id) {
  	
	
	return null;
}

	
	

}
