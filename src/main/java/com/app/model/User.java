package com.app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="UserName")
	private String UserName;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="Password")
	private String Password;
	@Column(name="ConfirmPassword")
	private String ConfirmPassword;
	@Column(name="Email")
	private String Email;
	@Column(name="Company")
	private String Company;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Question> que;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Answer> answer; 
	
	
	
	public Set<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<Answer> answer) {
		this.answer = answer;
	}
	public Set<Question> getQue() {
		return que;
	}
	public void setQue(Set<Question> que) {
		this.que = que;
	}
	public User() {
		super();
	}
	
	public User(int id, String userName, String firstName, String lastName, String password, String confirmPassword,
			String email, String company, Set<Question> que, Set<Answer> answer) {
		super();
		this.id = id;
		UserName = userName;
		FirstName = firstName;
		LastName = lastName;
		Password = password;
		ConfirmPassword = confirmPassword;
		Email = email;
		Company = company;
		this.que = que;
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.ConfirmPassword = confirmPassword;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		this.Company = company;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", UserName=" + UserName + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Password=" + Password + ", ConfirmPassword=" + ConfirmPassword + ", Email=" + Email + ", Company="
				+ Company + ", que=" + que + ", answer=" + answer + "]";
	}
	

}
