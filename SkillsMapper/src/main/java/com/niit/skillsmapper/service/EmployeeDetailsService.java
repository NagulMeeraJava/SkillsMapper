package com.niit.skillsmapper.service;

import com.niit.skillsmapper.model.EmployeeModel;
import com.niit.skillsmapper.model.SkillsModel;

public class EmployeeDetailsService 
{ 
	String employee_id,employee_fname;
	public void setEmployeeDetails(EmployeeModel emp)
	               {
                     emp.setEmployee_id("Niit-31765");
                     emp.setEmployee_fname("Nagul");
                     emp.setEmployee_lname("Shaik");
                     emp.setEmployee_gender("Male");
                     emp.setEmployee_role("TechMentor");
                     emp.setMobile_number(9052425);
                     emp.setPassword("password");
                     System.out.println(emp.getEmployee_id());                     
	               }
	               public void setEmployeeSkillsDetails(SkillsModel skills)
	               {
	            	   
	            	   skills.setTechnical_skills("C");
	            	   skills.setCertifications("Cloudera certification on Hadoop");
	            	   skills.setTotal_number_of_students(100);
	            	   skills.setYears_of_exp(4);
	            	   skills.setLanguages("Telugu");
	            	   skills.setNumber_of_placedstudents(80);
	            	   skills.setTotal_number_of_hours(1000);
	            	   
	               }

}
