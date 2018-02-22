package com.abrar.openapi.entity;
/**
 * UserViewPK entity.
 * File Name  :UserViewPK.java
 * Created on :Feb 24, 2011
 * @author    :Sushil Shakya
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserViewPK implements Serializable {
	private static final long serialVersionUID = -3545346694856248982L;
	private String umiUserId;	// added on 2nd march
	private Integer umiDesigId;	// added on 2nd march
	private Integer umiOrgnId;	
	private String umvMenuTrgt;

	public UserViewPK() {
	
	}

	@Column(name = "UMI_ORGN_ID", nullable = false)
	public Integer getUmiOrgnId() {
		return umiOrgnId;
	}

	public void setUmiOrgnId(Integer umiOrgnId) {
		this.umiOrgnId = umiOrgnId;
	}

	@Column(name = "UMV_MENU_TRGT", length = 65535)
	public String getUmvMenuTrgt() {
		return this.umvMenuTrgt;
	}
	
	public void setUmvMenuTrgt(String umvMenuTrgt) {
		this.umvMenuTrgt = umvMenuTrgt;
	}
	
	@Column(name = "UMI_USER_ID", nullable = false)
	public String getUmiUserId() {
		return this.umiUserId;
	}

	public void setUmiUserId(String umiUserId) {
		this.umiUserId = umiUserId;
	}
	
	public int hashCode() {
		return (int) umiOrgnId.hashCode();
	}
	
	@Column(name = "UMI_DESIG_ID", nullable = false)
	public Integer getUmiDesigId() {
		return umiDesigId;
	}

	public void setUmiDesigId(Integer umiDesigId) {
		this.umiDesigId = umiDesigId;
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof UserViewPK))
			return false;
		if (obj == null)
			return false;
		UserViewPK pk = (UserViewPK) obj;
		return pk.umvMenuTrgt == umvMenuTrgt && pk.umiOrgnId.equals(umiOrgnId) && pk.umiUserId.equals(umiUserId) && pk.umiDesigId.equals(umiDesigId);
	}

}