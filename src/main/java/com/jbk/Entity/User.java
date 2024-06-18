package com.jbk.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column(unique=true,nullable=false)
	private String userName;
	
	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String gender;
	
	@Column(unique=true,nullable=false)
	private String email;
	
	@Column(unique=true,nullable=false)
	private Long mobileNo;
	
	@Column(nullable=false)
	private String question;
	
	@Column(nullable=false)
	private String answer;
	
	@Column(nullable=false)
	private String role;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String userName, String lastName, String gender, String email, String password,
			Long mobileNo, String question, String answer, String role) {
		super();
		this.userName = userName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.mobileNo = mobileNo;
		this.question = question;
		this.answer = answer;
		this.role=role;
	}


	public String getuserName() {
		return userName;
	}


	public void setuserName(String userName) {
		this.userName = userName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [userName=" + userName + ", lastName=" + lastName + ", password=" + password + ", gender=" + gender
				+ ", email=" + email + ", mobileNo=" + mobileNo + ", question=" + question + ", answer=" + answer
				+ ", role=" + role + "]";
	}

	
}
