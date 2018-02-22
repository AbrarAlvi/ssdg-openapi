package com.abrar.openapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "custom_menu_user_map", schema = "slpo_aop")
@SequenceGenerator(name="custom_menu_user_map_seq", sequenceName="slpo_aop.custom_menu_user_map_id_seq")
public class CustomMenuUserMap {
	
	private static final long serialVersionUID = 1L;
	
	private Integer userMenuIdPk;
	private Integer userId;
	private String activeFlag;	
	private Date modifiedDate;   
    private CustomMenuActions menuIdNo;	
    
    
	
	
	public CustomMenuUserMap() {		
	}
	
	
	@Id
	@GeneratedValue(generator="custom_menu_user_map_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "pk_id", unique = true, nullable = false)
	public Integer getUserMenuIdPk() {
		return userMenuIdPk;
	}
	public void setUserMenuIdPk(Integer userMenuIdPk) {
		this.userMenuIdPk = userMenuIdPk;
	}		
	
	
	@Column(name = "user_id", nullable = false)
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
		
	
	@Column(name = "active_flag", length = 5)
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}



	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "menu_id" )
	public CustomMenuActions getMenuIdNo() {
		return menuIdNo;
	}

	public void setMenuIdNo(CustomMenuActions menuIdNo) {
		this.menuIdNo = menuIdNo;
	}
	
}
