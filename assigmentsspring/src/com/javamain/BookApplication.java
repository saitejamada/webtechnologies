package com.javamain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Book;
import com.pojo.Student;

public class BookApplication {

	public static void main(String[] args) {
	
		Resource r=new ClassPathResource("Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Book b=(Book) bf.getBean("b");
		System.out.println("Book Id Is "+b.getBid());
		System.out.println("Book name is "+b.getBookname());
		System.out.println("Book Price is "+b.getPrice());
		System.out.println("Book authour is "+b.getAuthour());
	}
}
