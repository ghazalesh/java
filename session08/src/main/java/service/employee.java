package service;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class employee {
	@JsonProperty("fname")
	private String firstname;
	@JsonProperty("lname")
	private String lastname;
	private  int age;
	private int salary;
	private String email;
	@JsonIgnore
	private Date date;
	
	
	
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public employee(String firstname, String lastname, int age, int salary, String email, Date date) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.salary = salary;
		this.email = email;
		this.date = date;
	}


	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "employee [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", salary=" + salary
				+ ", email=" + email + ", date=" + date + "]";
	}
	
	
}
