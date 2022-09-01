package com.javamain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Book;
import com.pojo.Products;

public class ProductApplication {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Products p=(Products) bf.getBean("p");
		System.out.println("Product id is "+p.getPid());
		System.out.println("Product name is "+p.getName());
		System.out.println("Product price is"+p.getPrice());	
	}
}
