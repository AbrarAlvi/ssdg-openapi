package com.abrar.openapi.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SequenceGenerator(name="usermaster_new", sequenceName="slpo_aop.usermaster_new_seq")
@Entity
@Table(name = "user_master", schema="slpo_aop")
public class UserMaster {
	
	
	Long id;
	String userId;
	String userName;
	String fatherName;
	Date dateOfBirth;
	String addressId;
	String gender;
	Date recordAddUser;
	Date recordAddDate;
	Date recordUpdateUser;
	Date recordUpdateDate;
	String userPassword;
	
	
	@Id
	@GeneratedValue(generator="usermaster_new", strategy = GenerationType.SEQUENCE)
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
	@Temporal(TemporalType.DATE)
	@Column(name = "dob", nullable = true, length = 255)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
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
	
	@Temporal(TemporalType.DATE)
	@Column(name = "record_add_user", length = 255)
	public Date getRecordAddUser() {
		return recordAddUser;
	}
	public void setRecordAddUser(Date recordAddUser) {
		this.recordAddUser = recordAddUser;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "record_add_date", nullable = false, length = 19)
	public Date getRecordAddDate() {
		return recordAddDate;
	}
	public void setRecordAddDate(Date recordAddDate) {
		this.recordAddDate = recordAddDate;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "record_update_user", length = 255)
	public Date getRecordUpdateUser() {
		return recordUpdateUser;
	}
	public void setRecordUpdateUser(Date recordUpdateUser) {
		this.recordUpdateUser = recordUpdateUser;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "record_update_date", nullable = false, length = 19)
	public Date getRecordUpdateDate() {
		return recordUpdateDate;
	}
	public void setRecordUpdateDate(Date recordUpdateDate) {
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
