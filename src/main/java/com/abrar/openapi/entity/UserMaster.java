package com.abrar.openapi.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_master")
public class UserMaster {
	
	
	Long id;
	String userId;
	String userName;
	String fatherName;
	Timestamp dateOfBirth;
	String addressId;
	String gender;
	String recordAddUser;
	Timestamp recordAddDate;
	String recordUpdateUser;
	Timestamp recordUpdateDate;
	String userPassword;
	
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "user_id", nullable = false, unique = true)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Column(name = "umv_user_name", length = 255)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name = "father_name", length = 255)
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	@Column(name = "dob", nullable = true, length = 19)
	public Timestamp getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Column(name = "address_id", length = 255)
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	
	@Column(name = "gender", length = 5)
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Column(name = "record_add_user", length = 255)
	public String getRecordAddUser() {
		return recordAddUser;
	}
	public void setRecordAddUser(String recordAddUser) {
		this.recordAddUser = recordAddUser;
	}
	
	@Column(name = "record_add_date", nullable = false, length = 19)
	public Timestamp getRecordAddDate() {
		return recordAddDate;
	}
	public void setRecordAddDate(Timestamp recordAddDate) {
		this.recordAddDate = recordAddDate;
	}
	
	@Column(name = "record_update_user", length = 255)
	public String getRecordUpdateUser() {
		return recordUpdateUser;
	}
	public void setRecordUpdateUser(String recordUpdateUser) {
		this.recordUpdateUser = recordUpdateUser;
	}
	
	
	@Column(name = "record_update_date", nullable = false, length = 19)
	public Timestamp getRecordUpdateDate() {
		return recordUpdateDate;
	}
	public void setRecordUpdateDate(Timestamp recordUpdateDate) {
		this.recordUpdateDate = recordUpdateDate;
	}
	
	@Column(name = "user_pwd", length = 255)
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
	
	
	

}
