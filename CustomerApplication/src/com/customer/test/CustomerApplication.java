package com.customer.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.customer.bean.Customer;

public class CustomerApplication {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("/com/customer/resource/Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Customer c=(Customer) bf.getBean("customer");
		System.out.println(c);
		
	}
}
