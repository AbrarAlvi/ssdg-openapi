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
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
/**
 * DesignationM entity.
 * File Name  :DesignationM.java
 * Created on :Feb 23, 2011
 * @author    :Sushil Shakya
 */
@SequenceGenerator(name="desigm_seq", sequenceName="slpo_aop.desigm_seq")
@Entity
@Table(name="ume_desig_mas", schema="slpo_aop")
public class DesignationM  implements java.io.Serializable {
	 private static final long serialVersionUID = -7051157287385548418L;
	 private Integer umiDesigId;
     private String umvDesigDesc;
     private Integer umiReportDesigId;
     private Short umiDesigLevel;
     private String umiDesigStatus;
     private String umvIpAddr;
     private String umvMacAddr;
     private String umiOid;
     private String umvRecordAddUser;
     private Timestamp umdRecordAddDate;
     private String umvRecordUpdateUser;
     private Timestamp umdRecordUpdateDate;
     private String parentDeptName;
     //private Set<RoleUserDesignationMap> roleUserDesignationMaps = new HashSet<RoleUserDesignationMap>(0);
     private Set<UserDesigOrganizationMap> userDesigOrganizationMaps = new HashSet<UserDesigOrganizationMap>(0);

    public DesignationM() {
    }

    @Id 
    @GeneratedValue(generator="desigm_seq", strategy=GenerationType.SEQUENCE)
    @Column(name="UMI_DESIG_ID", unique=true, nullable=false)
    public Integer getUmiDesigId() {
        return this.umiDesigId;
    }
    
    public void setUmiDesigId(Integer umiDesigId) {
        this.umiDesigId = umiDesigId;
    }
    
    @Column(name="UMV_DESIG_DESC", length=55)

    public String getUmvDesigDesc() {
        return this.umvDesigDesc;
    }
    
    public void setUmvDesigDesc(String umvDesigDesc) {
        this.umvDesigDesc = umvDesigDesc;
    }
    
    @Column(name="UMI_REPORT_DESIG_ID")

    public Integer getUmiReportDesigId() {
        return this.umiReportDesigId;
    }
    
    public void setUmiReportDesigId(Integer umiReportDesigId) {
        this.umiReportDesigId = umiReportDesigId;
    }
    
    @Column(name="UMI_DESIG_LEVEL")

    public Short getUmiDesigLevel() {
        return this.umiDesigLevel;
    }
    
    public void setUmiDesigLevel(Short umiDesigLevel) {
        this.umiDesigLevel = umiDesigLevel;
    }
    
    @Column(name="UMI_DESIG_STATUS", length=1)

    public String getUmiDesigStatus() {
        return this.umiDesigStatus;
    }
    
    public void setUmiDesigStatus(String umiDesigStatus) {
        this.umiDesigStatus = umiDesigStatus;
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
    
    @Column(name="UMI_OID", length=20)

    public String getUmiOid() {
        return this.umiOid;
    }
    
    public void setUmiOid(String umiOid) {
        this.umiOid = umiOid;
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
    
    /*@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="designationM")
    public Set<RoleUserDesignationMap> getRoleUserDesignationMaps() {
        return this.roleUserDesignationMaps;
    }
    
    public void setRoleUserDesignationMaps(Set<RoleUserDesignationMap> roleUserDesignationMaps) {
        this.roleUserDesignationMaps = roleUserDesignationMaps;
    }*/
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="designationM")
    public Set<UserDesigOrganizationMap> getUserDesigOrganizationMaps() {
        return this.userDesigOrganizationMaps;
    }
    
    public void setUserDesigOrganizationMaps(Set<UserDesigOrganizationMap> userDesigOrganizationMaps) {
        this.userDesigOrganizationMaps = userDesigOrganizationMaps;
    }
    
    
    
    
    
    
    
   @Transient
	public String getParentDeptName() {
		return parentDeptName;
	}

	public void setParentDeptName(String parentDeptName) {
		this.parentDeptName = parentDeptName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((umiDesigId == null) ? 0 : umiDesigId.hashCode());
		result = prime * result
				+ ((umiDesigLevel == null) ? 0 : umiDesigLevel.hashCode());
		result = prime * result
				+ ((umiDesigStatus == null) ? 0 : umiDesigStatus.hashCode());
		result = prime * result + ((umiOid == null) ? 0 : umiOid.hashCode());
		result = prime
				* result
				+ ((umiReportDesigId == null) ? 0 : umiReportDesigId.hashCode());
		result = prime * result
				+ ((umvDesigDesc == null) ? 0 : umvDesigDesc.hashCode());
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
		DesignationM other = (DesignationM) obj;
		if (umiDesigId == null) {
			if (other.umiDesigId != null)
				return false;
		} else if (!umiDesigId.equals(other.umiDesigId))
			return false;
		if (umiDesigLevel == null) {
			if (other.umiDesigLevel != null)
				return false;
		} else if (!umiDesigLevel.equals(other.umiDesigLevel))
			return false;
		if (umiDesigStatus == null) {
			if (other.umiDesigStatus != null)
				return false;
		} else if (!umiDesigStatus.equals(other.umiDesigStatus))
			return false;
		if (umiOid == null) {
			if (other.umiOid != null)
				return false;
		} else if (!umiOid.equals(other.umiOid))
			return false;
		if (umiReportDesigId == null) {
			if (other.umiReportDesigId != null)
				return false;
		} else if (!umiReportDesigId.equals(other.umiReportDesigId))
			return false;
		if (umvDesigDesc == null) {
			if (other.umvDesigDesc != null)
				return false;
		} else if (!umvDesigDesc.equals(other.umvDesigDesc))
			return false;
		return true;
	}
   

}