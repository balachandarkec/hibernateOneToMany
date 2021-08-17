package hbMappingDemo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hbMappingDemo.config.HibernateConfig;
import hbMappingDemo.model.Instructor;

public class InstructorDAO {
	
    public void saveInstructor(Instructor instructor) {
    	
    	Transaction trans=null;
    	try(Session session=HibernateConfig.getSessionFactory().openSession()){
    		trans=session.beginTransaction();
    		session.save(instructor);
    		
    		trans.commit();
    		
    	}catch(Exception e) {
    		if(trans!=null) {
    			trans.rollback();
    		}
    		e.printStackTrace();
    	}
    	
    }
    
    
 public void updateInstructor(Instructor instructor) {

 	Transaction trans=null;
 	try(Session session=HibernateConfig.getSessionFactory().openSession()){
 		trans=session.beginTransaction();
 		session.update(instructor);
 		
 		trans.commit();
 		
 	}catch(Exception e) {
 		if(trans!=null) {
 			trans.rollback();
 		}
 		e.printStackTrace();
 	}
    	
    }
 
 
public void deleteInstructor(int id) {
	Transaction trans=null;
	
	try(Session session=HibernateConfig.getSessionFactory().openSession()){
 		trans=session.beginTransaction();
 		Instructor target=session.get(Instructor.class, id);
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
   

public Instructor getInstructorById(int id) {
  	
	
	return null;
}


 
}
