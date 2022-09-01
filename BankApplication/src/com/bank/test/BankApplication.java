package com.bank.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.bank.bean.Bank;

public class BankApplication {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("/com/bank/resource/Beans.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Bank b=(Bank) bf.getBean("bank");
		System.out.println(b);
	}
}
