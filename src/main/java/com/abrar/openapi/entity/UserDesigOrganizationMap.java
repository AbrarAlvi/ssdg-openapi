package com.abrar.openapi.entity;

import java.sql.Timestamp;
import java.util.List;

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
import javax.persistence.Transient;
/**
 * UserDesigOrganizationMap entity.
 * File Name  :UserDesigOrganizationMap.java
 * Created on :Feb 23, 2011
 * @author    :Sushil Shakya
 */
@SequenceGenerator(name="user_desig_orgn_role_seq", sequenceName="slpo_aop.user_desig_orgn_role_seq")
@Entity
@Table(name="ume_user_desig_orgn_map", schema="slpo_aop")
public class UserDesigOrganizationMap  implements java.io.Serializable {
	 private Integer umiUserDesigPk;
	 private RoleM roleM;	/* ADDED ON 3RD MARCH 2011 FOR ROLE */
	 private DesignationM designationM;
     private LogInUser logInUser;
     //private LogInUser reportToUser;
     private OrganizationM organizationM;
     /* ADDED ON 2ND MARCH 2011 FOR REPORT TO USER */
     private String reportToId;
     private List<UmvUserPriv> userPrivList;
     private Short umiDesigLevel;
     /* ADDED ON 16TH MARCH 2011 FOR Status */
     private String mapStatus;
     private String umvRecordAddUser;
     private Timestamp umdRecordAddDate;
     private String umvRecordUpdateUser;
     private Timestamp umdRecordUpdateDate;
     
	public UserDesigOrganizationMap() {
    }

    @Id 
    @GeneratedValue(generator="user_desig_orgn_role_seq", strategy=GenerationType.SEQUENCE)
    @Column(name="UMI_USER_DESIG_PK", nullable=false)
    public Integer getUmiUserDesigPk() {
        return this.umiUserDesigPk;
    }
    
    public void setUmiUserDesigPk(Integer umiUserDesigPk) {
        this.umiUserDesigPk = umiUserDesigPk;
    }
    
    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "UMI_ROLE_ID")
    public RoleM getRoleM() {
		return roleM;
	}

	public void setRoleM(RoleM roleM) {
		this.roleM = roleM;
	}

	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="UMI_DESIG_ID")
    public DesignationM getDesignationM() {
        return this.designationM;
    }
    
    public void setDesignationM(DesignationM designationM) {
        this.designationM = designationM;
    }
    
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="UMI_USER_ID", referencedColumnName="UMI_USER_ID")
    public LogInUser getLogInUser() {
        return this.logInUser;
    }
    
    public void setLogInUser(LogInUser logInUser) {
        this.logInUser = logInUser;
    }
    
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="UMI_ORGN_ID")
    public OrganizationM getOrganizationM() {
        return this.organizationM;
    }
    
    public void setOrganizationM(OrganizationM organizationM) {
        this.organizationM = organizationM;
    }
	
	@Column(name="UMI_REPORT_TO_ID", nullable=true)
	public String getReportToId() {
		return reportToId;
	}

	public void setReportToId(String reportToId) {
		this.reportToId = reportToId;
	}
	
	@Column(name="UMI_DESIG_LEVEL")
    public Short getUmiDesigLevel() {
        return this.umiDesigLevel;
    }
    
    public void setUmiDesigLevel(Short umiDesigLevel) {
        this.umiDesigLevel = umiDesigLevel;
    }
    
    @Column(name="UMC_MAP_STATUS")
    public String getMapStatus() {
		return mapStatus;
	}

	public void setMapStatus(String mapStatus) {
		this.mapStatus = mapStatus;
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
	
	@Transient
    public List<UmvUserPriv> getUserPrivList() {
		return userPrivList;
	}

	public void setUserPrivList(List<UmvUserPriv> userPrivList) {
		this.userPrivList = userPrivList;
	}
	
	
	/*@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="UMI_REPORT_TO_ID", referencedColumnName="UMI_USER_ID")
	public LogInUser getReportToUser() {
		return reportToUser;
	}

	public void setReportToUser(LogInUser reportToUser) {
		this.reportToUser = reportToUser;
	}*/
}