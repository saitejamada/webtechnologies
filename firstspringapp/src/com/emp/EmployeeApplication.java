package com.emp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Employee e=(Employee) bf.getBean("e");
		System.out.println("Employee Id="+e.getEid());
		System.out.println("Employee Name="+e.getName());
		System.out.println("Salary="+e.getSalary());
	}

}
