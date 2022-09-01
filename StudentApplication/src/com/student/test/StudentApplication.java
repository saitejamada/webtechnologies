package com.student.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.student.bean.Student;


public class StudentApplication {

	public static void main(String[] args) {
	
		Resource r=new ClassPathResource("/com/student/resource/StudentBeans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Student s=(Student) bf.getBean("stud");
		System.out.println(s);
	}
}
