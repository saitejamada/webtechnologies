package com.product.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.product.bean.Product;

public class ProductApplication {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("/com/product/resource/Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Product p=(Product) bf.getBean("p");
		System.out.println(p);
	}
}
