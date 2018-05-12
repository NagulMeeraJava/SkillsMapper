package com.niit.skillsmapper.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.skillsmapper.model.EmployeeModel;
import com.niit.skillsmapper.model.SkillsModel;
import com.niit.skillsmapper.service.EmployeeDetailsService;


public class EmployeeMapping {


	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		EmployeeDetailsService service=(EmployeeDetailsService)context.getBean("employee");
		     
	
		
		service.setEmployeeDetails(new EmployeeModel());
		service.setEmployeeSkillsDetails(new SkillsModel());
	}

}
