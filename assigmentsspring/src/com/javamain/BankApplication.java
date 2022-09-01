package com.javamain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.pojo.Bank;

public class BankApplication {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Bank bank=(Bank) bf.getBean("bank");
		System.out.println(" "+bank);
	}
}
