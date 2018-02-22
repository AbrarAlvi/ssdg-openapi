package com.abrar.openapi.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 * ScaleM entity.
 * File Name  :ScaleM.java
 * Created on :Feb 23, 2011
 * @author    :Sushil Shakya
 */
@SequenceGenerator(name="scalem_seq", sequenceName="slpo_aop.scalem_seq")
@Entity
@Table(name="ume_scale_mas", schema="slpo_aop")
public class ScaleM  implements java.io.Serializable {
     
	private Integer umiScaleId;
	private String umvScaleDesc;
	private Integer umiScaleIdHigher;
	private String umcScaleStatus;
	private String umvIpAddr;
	private String umvMacAddr;
	private String umiOid;
	private String umvRecordAddUser;
	private Timestamp umdRecordAddDate;
	private String umvRecordUpdateUser;
	private Timestamp umdRecordUpdateDate;
	
	public ScaleM() {
	}
	
	@Id
	@GeneratedValue(generator="scalem_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "UMI_SCALE_ID", unique = true, nullable = false)
	public Integer getUmiScaleId() {
		return this.umiScaleId;
	}

	public void setUmiScaleId(Integer umiScaleId) {
		this.umiScaleId = umiScaleId;
	}

	@Column(name = "UMV_SCALE_DESC", length = 20)
	public String getUmvScaleDesc() {
		return this.umvScaleDesc;
	}

	public void setUmvScaleDesc(String umvScaleDesc) {
		this.umvScaleDesc = umvScaleDesc;
	}

	@Column(name = "UMI_SCALE_ID_HIGHER")
	public Integer getUmiScaleIdHigher() {
		return this.umiScaleIdHigher;
	}

	public void setUmiScaleIdHigher(Integer umiScaleIdHigher) {
		this.umiScaleIdHigher = umiScaleIdHigher;
	}

	@Column(name = "UMC_SCALE_STATUS", nullable = false, length = 1)
	public String getUmcScaleStatus() {
		return this.umcScaleStatus;
	}

	public void setUmcScaleStatus(String umcScaleStatus) {
		this.umcScaleStatus = umcScaleStatus;
	}

	@Column(name = "UMV_IP_ADDR", length = 15)
	public String getUmvIpAddr() {
		return this.umvIpAddr;
	}

	public void setUmvIpAddr(String umvIpAddr) {
		this.umvIpAddr = umvIpAddr;
	}

	@Column(name = "UMV_MAC_ADDR", length = 17)
	public String getUmvMacAddr() {
		return this.umvMacAddr;
	}

	public void setUmvMacAddr(String umvMacAddr) {
		this.umvMacAddr = umvMacAddr;
	}

	@Column(name = "UMI_OID", length = 20)
	public String getUmiOid() {
		return this.umiOid;
	}

	public void setUmiOid(String umiOid) {
		this.umiOid = umiOid;
	}

	@Column(name = "UMV_RECORD_ADD_USER", length = 20)
	public String getUmvRecordAddUser() {
		return this.umvRecordAddUser;
	}

	public void setUmvRecordAddUser(String umvRecordAddUser) {
		this.umvRecordAddUser = umvRecordAddUser;
	}

	@Column(name = "UMD_RECORD_ADD_DATE", length = 19)
	public Timestamp getUmdRecordAddDate() {
		return this.umdRecordAddDate;
	}

	public void setUmdRecordAddDate(Timestamp umdRecordAddDate) {
		this.umdRecordAddDate = umdRecordAddDate;
	}

	@Column(name = "UMV_RECORD_UPDATE_USER", length = 20)
	public String getUmvRecordUpdateUser() {
		return this.umvRecordUpdateUser;
	}

	public void setUmvRecordUpdateUser(String umvRecordUpdateUser) {
		this.umvRecordUpdateUser = umvRecordUpdateUser;
	}

	@Column(name = "UMD_RECORD_UPDATE_DATE", length = 19)
	public Timestamp getUmdRecordUpdateDate() {
		return this.umdRecordUpdateDate;
	}

	public void setUmdRecordUpdateDate(Timestamp umdRecordUpdateDate) {
		this.umdRecordUpdateDate = umdRecordUpdateDate;
	}

	public String toString() {
		return (umiScaleId+", "+ umvScaleDesc+", "+umcScaleStatus).toString();
	}
   
}