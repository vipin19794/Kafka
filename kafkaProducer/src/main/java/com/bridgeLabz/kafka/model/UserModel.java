package com.bridgeLabz.kafka.model;

public class UserModel 
{
     private String name;
     private String dept;
     private Long salary;
     private Long mobile;
     private String email;
     
     public UserModel()
     {
    	 
     }
     
     public UserModel(String name,String dept,Long salary, Long mobile, String email)
     {
    	 this.name = name;
    	 this.dept = dept;
    	 this.salary = salary;
    	 this.mobile = mobile;
    	 this.email = email;
     }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
     
	
     
     
}
