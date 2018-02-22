package com.abrar.openapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * UmeAddressDtl entity.
 * File Name  :UmeAddressDtl.java
 * Created on :April 4, 2011
 * @author    :Sushil Shakya
 */
@SequenceGenerator(name="address_seq", sequenceName="slpo_aop.address_seq")
@Entity
@Table(name = "ume_address_dtl", schema="slpo_aop")
public class UmeAddressDtl implements java.io.Serializable {
	private static final long serialVersionUID = -1741388224234560631L;
	private Integer umiAddressPk;
	private Integer umiAddressId;
	private String umvAddressDesc;
	private String umvCity;
	private String umvState;
	private String umvCountry;
	private String umvPin;
	private String umvPhone;
	private String umvMobile;
	private String umvEmail;

	public UmeAddressDtl() {
	}
	
	public UmeAddressDtl(Integer umiAddressPk) {
		this.umiAddressPk = umiAddressPk;
	}
	
	@Id
	@GeneratedValue(generator="address_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "UMI_ADDRESS_PK", unique = true, nullable = false)
	public Integer getUmiAddressPk() {
		return this.umiAddressPk;
	}

	public void setUmiAddressPk(Integer umiAddressPk) {
		this.umiAddressPk = umiAddressPk;
	}

	@Column(name = "UMI_ADDRESS_ID")
	public Integer getUmiAddressId() {
		return this.umiAddressId;
	}

	public void setUmiAddressId(Integer umiAddressId) {
		this.umiAddressId = umiAddressId;
	}

	@Column(name = "UMV_ADDRESS_DESC", length = 150)
	public String getUmvAddressDesc() {
		return this.umvAddressDesc;
	}

	public void setUmvAddressDesc(String umvAddressDesc) {
		this.umvAddressDesc = umvAddressDesc;
	}

	@Column(name = "UMV_CITY", length = 25)
	public String getUmvCity() {
		return this.umvCity;
	}

	public void setUmvCity(String umvCity) {
		this.umvCity = umvCity;
	}

	@Column(name = "UMV_STATE", length = 30)
	public String getUmvState() {
		return this.umvState;
	}

	public void setUmvState(String umvState) {
		this.umvState = umvState;
	}

	@Column(name = "UMV_COUNTRY", length = 20)
	public String getUmvCountry() {
		return this.umvCountry;
	}

	public void setUmvCountry(String umvCountry) {
		this.umvCountry = umvCountry;
	}

	@Column(name = "UMV_PIN", length = 6)
	public String getUmvPin() {
		return this.umvPin;
	}

	public void setUmvPin(String umvPin) {
		this.umvPin = umvPin;
	}

	@Column(name = "UMV_PHONE", length = 11)
	public String getUmvPhone() {
		return this.umvPhone;
	}

	public void setUmvPhone(String umvPhone) {
		this.umvPhone = umvPhone;
	}

	@Column(name = "UMV_MOBILE", length = 13)
	public String getUmvMobile() {
		return this.umvMobile;
	}

	public void setUmvMobile(String umvMobile) {
		this.umvMobile = umvMobile;
	}
	
	@Column(name = "UMV_EMAIL", length = 40)
	public String getUmvEmail() {
		return umvEmail;
	}

	public void setUmvEmail(String umvEmail) {
		this.umvEmail = umvEmail;
	}

}