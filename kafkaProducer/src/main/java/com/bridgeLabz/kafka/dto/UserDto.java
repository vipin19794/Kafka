package com.bridgeLabz.kafka.dto;

import org.springframework.stereotype.Component;

@Component
public class UserDto 
{
	private String  d_name;
    private String  d_dept;
    private Long  d_salary;
    private Long d_mobile;
    private String d_email;
    
	public String getD_name() 
	{
		return d_name;
	}
	public void setD_name(String d_name) 
	{
		this.d_name = d_name;
	}
	public String getD_dept() 
	{
		return d_dept;
	}
	public void setD_dept(String d_dept) 
	{
		this.d_dept = d_dept;
	}
	public Long getD_salary() 
	{
		return d_salary;
	}
	public void setD_salary(Long d_salary) 
	{
		this.d_salary = d_salary;
	}
	public Long getD_mobile() {
		return d_mobile;
	}
	public void setD_mobile(Long d_mobile) {
		this.d_mobile = d_mobile;
	}
	public String getD_email() {
		return d_email;
	}
	public void setD_email(String d_email) {
		this.d_email = d_email;
	}
    
    
}
