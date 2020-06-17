package com.JDBC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {
	
	public static void main (String args[]) {
		Resource rs = new ClassPathResource("SpringConfigure.xml");
		
		BeanFactory factory =  new XmlBeanFactory(rs);
		MobileDetails x=(MobileDetails)factory.getBean("mobile");
		Mobile m = new Mobile();
		//m.setMid(01);
		//m.setMname("Iphone");
		//m.setMprice(7900);
				//m.setMid(03);
				//m.setMname("seephone");
				//m.setMprice(750);
		
		// int i=x.insertMobile(m);
		m.setMid(01);
		//m.setMname("Iphone");
		//m.setMprice(79000);
		Boolean i=x.deleteMobile(m);
		if(i)
			System.out.println("Record deleted"); 
	}

}
