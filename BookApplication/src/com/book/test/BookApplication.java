package com.book.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.book.bean.Book;

public class BookApplication {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("/com/book/resource/Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Book b=(Book) bf.getBean("bk");
		System.out.println(b);
	}
}
