package com.javamain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Customer;



public class customerApplication {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Customer cust=(Customer) bf.getBean("customer");
		System.out.println(cust);
	}
}
