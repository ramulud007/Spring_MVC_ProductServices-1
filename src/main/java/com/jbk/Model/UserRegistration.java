package com.jbk.Model;



public class UserRegistration {


	private String userName;
	private String lastName;
	private String password;
	private String gender;
	private String email;
	private Long mobileNo;
	private String question;
	private String answer;
	
	
	public UserRegistration() {
		// TODO Auto-generated constructor stub
	}


	public UserRegistration(String userName, String lastName, String password, String gender, String email,
			Long mobileNo, String question, String answer) {
		super();
		this.userName = userName;
		this.lastName = lastName;
		this.password = password;
		this.gender = gender;
		this.email = email;
		this.mobileNo = mobileNo;
		this.question = question;
		this.answer = answer;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	@Override
	public String toString() {
		return "UserRegistration [userName=" + userName + ", lastName=" + lastName + ", password=" + password
				+ ", gender=" + gender + ", email=" + email + ", mobileNo=" + mobileNo + ", question=" + question
				+ ", answer=" + answer + "]";
	}


	
}
