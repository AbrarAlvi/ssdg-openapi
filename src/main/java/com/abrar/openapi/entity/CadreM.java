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
 * CadreM entity.
 * File Name  :CadreM.java
 * Created on :Feb 23, 2011
 * @author    :Sushil Shakya
 */
@SequenceGenerator(name="cadrem_seq", sequenceName="slpo_aop.cadrem_seq")
@Entity
@Table(name="ume_cadre_mas", schema="slpo_aop")
public class CadreM  implements java.io.Serializable {
	 private static final long serialVersionUID = 6434077314394263298L;
	 private Integer umiCadreId;
     private String umvCadreDiscription;
     private String umvCentralState;
     private Integer umiCadreIdNext;
     private String umiOid;
     private String umiCadreStatus;
     private String umvIpAddr;
     private String umvMacAddr;
     private String umvRecordAddUser;
     private Timestamp umdRecordAddDate;
     private String umvRecordUpdateUser;
     private Timestamp umdRecordUpdateDate;
     private Set<LogInUser> logInUsers = new HashSet<LogInUser>(0);

    public CadreM() {
    }
  
    @Id 
    @GeneratedValue(generator="cadrem_seq" , strategy=GenerationType.SEQUENCE)
    @Column(name="UMI_CADRE_ID", unique=true, nullable=false)

    public Integer getUmiCadreId() {
        return this.umiCadreId;
    }
    
    public void setUmiCadreId(Integer umiCadreId) {
        this.umiCadreId = umiCadreId;
    }
    
    @Column(name="UMV_CADRE_DISCRIPTION", length=20)

    public String getUmvCadreDiscription() {
        return this.umvCadreDiscription;
    }
    
    public void setUmvCadreDiscription(String umvCadreDiscription) {
        this.umvCadreDiscription = umvCadreDiscription;
    }
    
    @Column(name="UMV_CENTRAL_STATE", length=20)

    public String getUmvCentralState() {
        return this.umvCentralState;
    }
    
    public void setUmvCentralState(String umvCentralState) {
        this.umvCentralState = umvCentralState;
    }
    
    @Column(name="UMI_CADRE_ID_NEXT")

    public Integer getUmiCadreIdNext() {
        return this.umiCadreIdNext;
    }
    
    public void setUmiCadreIdNext(Integer umiCadreIdNext) {
        this.umiCadreIdNext = umiCadreIdNext;
    }
    
    @Column(name="UMI_OID", length=20)

    public String getUmiOid() {
        return this.umiOid;
    }
    
    public void setUmiOid(String umiOid) {
        this.umiOid = umiOid;
    }
    
    @Column(name="UMI_CADRE_STATUS", length=1)

    public String getUmiCadreStatus() {
        return this.umiCadreStatus;
    }
    
    public void setUmiCadreStatus(String umiCadreStatus) {
        this.umiCadreStatus = umiCadreStatus;
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
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="cadreM")
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
				+ ((umiCadreId == null) ? 0 : umiCadreId.hashCode());
		result = prime * result
				+ ((umiCadreIdNext == null) ? 0 : umiCadreIdNext.hashCode());
		result = prime * result
				+ ((umiCadreStatus == null) ? 0 : umiCadreStatus.hashCode());
		result = prime * result + ((umiOid == null) ? 0 : umiOid.hashCode());
		result = prime
				* result
				+ ((umvCadreDiscription == null) ? 0 : umvCadreDiscription
						.hashCode());
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
		CadreM other = (CadreM) obj;
		if (umiCadreId == null) {
			if (other.umiCadreId != null)
				return false;
		} else if (!umiCadreId.equals(other.umiCadreId))
			return false;
		if (umiCadreIdNext == null) {
			if (other.umiCadreIdNext != null)
				return false;
		} else if (!umiCadreIdNext.equals(other.umiCadreIdNext))
			return false;
		if (umiCadreStatus == null) {
			if (other.umiCadreStatus != null)
				return false;
		} else if (!umiCadreStatus.equals(other.umiCadreStatus))
			return false;
		if (umiOid == null) {
			if (other.umiOid != null)
				return false;
		} else if (!umiOid.equals(other.umiOid))
			return false;
		if (umvCadreDiscription == null) {
			if (other.umvCadreDiscription != null)
				return false;
		} else if (!umvCadreDiscription.equals(other.umvCadreDiscription))
			return false;
		return true;
	}
   
}