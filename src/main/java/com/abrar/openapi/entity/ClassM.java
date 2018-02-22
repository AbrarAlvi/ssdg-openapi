package com.abrar.openapi.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 * ClassM entity.
 * File Name  :ClassM.java
 * Created on :Feb 23, 2011
 * @author    :Sushil Shakya
 */
@SequenceGenerator(name="classm_seq", sequenceName="slpo_aop.classm_seq")
@Entity
@Table(name="ume_class_mas", schema="slpo_aop")
public class ClassM  implements java.io.Serializable {
     private Integer umiClassId;
     private String umvClassDesc;
     private Integer umiClassIdHigher;
     private String umiClassStatus;
     private String umiOid;
     private String umvIpAddr;
     private String umvMacAddr;
     private String umvRecordAddUser;
     private Timestamp umdRecordAddDate;
     private String umvRecordUpdateUser;
     private Timestamp umdRecordUpdateDate;
     private Set<LogInUser> logInUsers = new HashSet<LogInUser>(0);

    public ClassM() {
    }

    @Id 
    @GeneratedValue(generator="classm_seq", strategy=GenerationType.SEQUENCE)
    @Column(name="UMI_CLASS_ID", unique=true, nullable=false)
    public Integer getUmiClassId() {
        return this.umiClassId;
    }
    
    public void setUmiClassId(Integer umiClassId) {
        this.umiClassId = umiClassId;
    }
    
    @Column(name="UMV_CLASS_DESC", length=20)

    public String getUmvClassDesc() {
        return this.umvClassDesc;
    }
    
    public void setUmvClassDesc(String umvClassDesc) {
        this.umvClassDesc = umvClassDesc;
    }
    
    @Column(name="UMI_CLASS_ID_HIGHER")

    public Integer getUmiClassIdHigher() {
        return this.umiClassIdHigher;
    }
    
    public void setUmiClassIdHigher(Integer umiClassIdHigher) {
        this.umiClassIdHigher = umiClassIdHigher;
    }
    
    @Column(name="UMI_CLASS_STATUS", length=1)

    public String getUmiClassStatus() {
        return this.umiClassStatus;
    }
    
    public void setUmiClassStatus(String umiClassStatus) {
        this.umiClassStatus = umiClassStatus;
    }
    
    @Column(name="UMI_OID", length=20)

    public String getUmiOid() {
        return this.umiOid;
    }
    
    public void setUmiOid(String umiOid) {
        this.umiOid = umiOid;
    }
    
    @Column(name="UMV_IP_ADDR", length=15)

    public String getUmvIpAddr() {
        return this.umvIpAddr;
    }
    
    public void setUmvIpAddr(String umvIpAddr) {
        this.umvIpAddr = umvIpAddr;
    }
    
    @Column(name="UMV_MAC_ADDR", length=17)

    public String getUmvMacAddr() {
        return this.umvMacAddr;
    }
    
    public void setUmvMacAddr(String umvMacAddr) {
        this.umvMacAddr = umvMacAddr;
    }
    
    @Column(name="UMV_RECORD_ADD_USER", length=20)

    public String getUmvRecordAddUser() {
        return this.umvRecordAddUser;
    }
    
    public void setUmvRecordAddUser(String umvRecordAddUser) {
        this.umvRecordAddUser = umvRecordAddUser;
    }
    
    @Column(name="UMD_RECORD_ADD_DATE", length=19)

    public Timestamp getUmdRecordAddDate() {
        return this.umdRecordAddDate;
    }
    
    public void setUmdRecordAddDate(Timestamp umdRecordAddDate) {
        this.umdRecordAddDate = umdRecordAddDate;
    }
    
    @Column(name="UMV_RECORD_UPDATE_USER", length=20)

    public String getUmvRecordUpdateUser() {
        return this.umvRecordUpdateUser;
    }
    
    public void setUmvRecordUpdateUser(String umvRecordUpdateUser) {
        this.umvRecordUpdateUser = umvRecordUpdateUser;
    }
    
    @Column(name="UMD_RECORD_UPDATE_DATE", length=19)
    public Timestamp getUmdRecordUpdateDate() {
        return this.umdRecordUpdateDate;
    }
    
    public void setUmdRecordUpdateDate(Timestamp umdRecordUpdateDate) {
        this.umdRecordUpdateDate = umdRecordUpdateDate;
    }

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="classM")
    public Set<LogInUser> getLogInUsers() {
        return this.logInUsers;
    }
    
    public void setLogInUsers(Set<LogInUser> logInUsers) {
        this.logInUsers = logInUsers;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((umiClassId == null) ? 0 : umiClassId.hashCode());
		result = prime
				* result
				+ ((umiClassIdHigher == null) ? 0 : umiClassIdHigher.hashCode());
		result = prime * result
				+ ((umiClassStatus == null) ? 0 : umiClassStatus.hashCode());
		result = prime * result + ((umiOid == null) ? 0 : umiOid.hashCode());
		result = prime * result
				+ ((umvClassDesc == null) ? 0 : umvClassDesc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassM other = (ClassM) obj;
		if (umiClassId == null) {
			if (other.umiClassId != null)
				return false;
		} else if (!umiClassId.equals(other.umiClassId))
			return false;
		if (umiClassIdHigher == null) {
			if (other.umiClassIdHigher != null)
				return false;
		} else if (!umiClassIdHigher.equals(other.umiClassIdHigher))
			return false;
		if (umiClassStatus == null) {
			if (other.umiClassStatus != null)
				return false;
		} else if (!umiClassStatus.equals(other.umiClassStatus))
			return false;
		if (umiOid == null) {
			if (other.umiOid != null)
				return false;
		} else if (!umiOid.equals(other.umiOid))
			return false;
		if (umvClassDesc == null) {
			if (other.umvClassDesc != null)
				return false;
		} else if (!umvClassDesc.equals(other.umvClassDesc))
			return false;
		return true;
	}
   
}