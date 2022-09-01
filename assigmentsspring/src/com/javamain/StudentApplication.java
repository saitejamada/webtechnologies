package com.javamain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Student;

public class StudentApplication {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Student s=(Student) bf.getBean("e");
		System.out.println("Student Id="+s.getSid());
		System.out.println("Student Name="+s.getName());
		System.out.println("Marks ="+s.getMarks());
	}
}
