package com.hibernate.onetoone.assi.eagertolazy.onetoone.assi.eagertolazy;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student std=new Student();
    	std.setsId(1);
    	std.setsName("manju");
    	
    	Student std1=new Student();
    	std1.setsId(2);
    	std1.setsName("saloma");
    	   
    	Teacher tech= new Teacher();
    	tech.settId(101);
    	tech.settName("naruto");
    	
    	Teacher tech1= new Teacher();
    	tech1.settId(102);
    	tech1.settName("hinata");
    	
    	
    	// "to set teacher to student table // Fk  for student table"
    	std.setTeacher(tech);
    	std1.setTeacher(tech1);
    	
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Teacher.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
    	
		
		List<Object> lists =new ArrayList<Object>();
		lists.add(tech1);
		lists.add(tech);
		lists.add(std);
		lists.add(std1);
		
		Student student=session.get(Student.class, 1);
		System.out.println(student);
		
		Teacher teacher=session.get(Teacher.class, 101);
		System.out.println(teacher);
		
		for(Object li:lists)
		{
			System.out.println(li);
			session.save(li);
		}
		
		trans.commit();
		session.close();
    }
}
