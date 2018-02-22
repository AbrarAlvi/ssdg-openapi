package com.abrar.openapi.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@SequenceGenerator(name="orgnm_seq", sequenceName="slpo_aop.orgnm_seq")
@Entity
@Table(name="ume_orgn_mas", schema="slpo_aop")
public class OrganizationM  implements java.io.Serializable {
	 private static final long serialVersionUID = -5815155659751216232L;
	 private Integer umiOrgnId;
	 private String umvOrgnCode;
     private String umvOrgnName;
     private Integer umiOrgnPrntId;
     private Short umiOrgnLevel;
     private Short umiOrgnIndex;
     private String umcOrgnStatus;
     private String umvIpAddr;
     private String umvMacAddr;
     private String umiOid;
     private String recordAddUser;
     private Timestamp recordAddDate;
     private String recordUpdateUser;
     private Timestamp recordUpdateDate;
     private OrganizationM organizationM;     
 	private String orgnaddrline21 ;
    private String orgnaddrline22 ;
    private String orgnaddrpin ;
    private String orgnaddrlinefax ;
    private String orgnaddrlinedistrict ;
    private String orgnaddrlinestate ;
    private String orgnaddrlinephone; 
    private String orgnemailid ;
     
     
     protected List<OrganizationM> children;
     
     
     public String toString(){
    	 return this.umvOrgnName;
     }
     
     
     @Transient
     public List<RoleM> getRoles(){
    	 return null;
     }
     
     
    @OneToMany(mappedBy = "organizationM",fetch=FetchType.LAZY)    
    public List<OrganizationM> getChildren() {
		return children;
	}

	public void setChildren(List<OrganizationM> children) {
		this.children = children;
	}

	@ManyToOne
    @JoinColumn(name="UMV_PARENT_ORGANIZATION")
    public OrganizationM getOrganizationM() {
		return organizationM;
	}

	public void setOrganizationM(OrganizationM organizationM) {
		this.organizationM = organizationM;
	}

	public String getOrgnaddrpin() {
		return orgnaddrpin;
	}

	public void setOrgnaddrpin(String orgnaddrpin) {
		this.orgnaddrpin = orgnaddrpin;
	}

	public String getOrgnaddrlinefax() {
		return orgnaddrlinefax;
	}

	public void setOrgnaddrlinefax(String orgnaddrlinefax) {
		this.orgnaddrlinefax = orgnaddrlinefax;
	}

	public String getOrgnaddrlinephone() {
		return orgnaddrlinephone;
	}

	public void setOrgnaddrlinephone(String orgnaddrlinephone) {
		this.orgnaddrlinephone = orgnaddrlinephone;
	}


     
     
     
     private Set<UserDesigOrganizationMap> userDesigOrganizationMaps = new HashSet<UserDesigOrganizationMap>(0);

    public OrganizationM() {
    }
    
    public OrganizationM(Integer umiOrgnId) {
    	this.umiOrgnId = umiOrgnId;
    }

    @Id 
    @GeneratedValue(generator="orgnm_seq", strategy=GenerationType.SEQUENCE)
    @Column(name="UMI_ORGN_ID", unique=true, nullable=false)
    public Integer getUmiOrgnId() {
        return this.umiOrgnId;
    }
    
    public void setUmiOrgnId(Integer umiOrgnId) {
        this.umiOrgnId = umiOrgnId;
    }
    
    @Column(name="UMV_ORGN_NAME", nullable=false, length=55)

    public String getUmvOrgnName() {
        return this.umvOrgnName;
    }
    
    public void setUmvOrgnName(String umvOrgnName) {
        this.umvOrgnName = umvOrgnName;
    }
    
    @Column(name="UMI_ORGN_PRNT_ID")

    public Integer getUmiOrgnPrntId() {
        return this.umiOrgnPrntId;
    }
    
    public void setUmiOrgnPrntId(Integer umiOrgnPrntId) {
        this.umiOrgnPrntId = umiOrgnPrntId;
    }
    
    @Column(name="UMI_ORGN_LEVEL")

    public Short getUmiOrgnLevel() {
        return this.umiOrgnLevel;
    }
    
    public void setUmiOrgnLevel(Short umiOrgnLevel) {
        this.umiOrgnLevel = umiOrgnLevel;
    }
    
    @Column(name="UMI_ORGN_INDEX")

    public Short getUmiOrgnIndex() {
        return this.umiOrgnIndex;
    }
    
    public void setUmiOrgnIndex(Short umiOrgnIndex) {
        this.umiOrgnIndex = umiOrgnIndex;
    }
    
    @Column(name="UMC_ORGN_STATUS", nullable=false, length=1)

    public String getUmcOrgnStatus() {
        return this.umcOrgnStatus;
    }
    
    public void setUmcOrgnStatus(String umcOrgnStatus) {
        this.umcOrgnStatus = umcOrgnStatus;
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
    
    @Column(name="RECORD_ADD_USER", length=20)

    public String getRecordAddUser() {
        return this.recordAddUser;
    }
    
    public void setRecordAddUser(String recordAddUser) {
        this.recordAddUser = recordAddUser;
    }
    
    @Column(name="RECORD_ADD_DATE", length=19)

    public Timestamp getRecordAddDate() {
        return this.recordAddDate;
    }
    
    public void setRecordAddDate(Timestamp recordAddDate) {
        this.recordAddDate = recordAddDate;
    }
    
    @Column(name="RECORD_UPDATE_USER", length=20)

    public String getRecordUpdateUser() {
        return this.recordUpdateUser;
    }
    
    public void setRecordUpdateUser(String recordUpdateUser) {
        this.recordUpdateUser = recordUpdateUser;
    }
    
    @Column(name="RECORD_UPDATE_DATE", length=19)

    public Timestamp getRecordUpdateDate() {
        return this.recordUpdateDate;
    }
    
    public void setRecordUpdateDate(Timestamp recordUpdateDate) {
        this.recordUpdateDate = recordUpdateDate;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="organizationM")
    @javax.persistence.OrderBy("logInUser")
    public Set<UserDesigOrganizationMap> getUserDesigOrganizationMaps() {
        return this.userDesigOrganizationMaps;
    }
    
    public void setUserDesigOrganizationMaps(Set<UserDesigOrganizationMap> userDesigOrganizationMaps) {
        this.userDesigOrganizationMaps = userDesigOrganizationMaps;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((umcOrgnStatus == null) ? 0 : umcOrgnStatus.hashCode());
		result = prime * result + ((umiOid == null) ? 0 : umiOid.hashCode());
		result = prime * result
				+ ((umiOrgnId == null) ? 0 : umiOrgnId.hashCode());
		result = prime * result
				+ ((umiOrgnIndex == null) ? 0 : umiOrgnIndex.hashCode());
		result = prime * result
				+ ((umiOrgnLevel == null) ? 0 : umiOrgnLevel.hashCode());
		result = prime * result
				+ ((umiOrgnPrntId == null) ? 0 : umiOrgnPrntId.hashCode());
		result = prime * result
				+ ((umvOrgnName == null) ? 0 : umvOrgnName.hashCode());
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
		OrganizationM other = (OrganizationM) obj;
		if (umcOrgnStatus == null) {
			if (other.umcOrgnStatus != null)
				return false;
		} else if (!umcOrgnStatus.equals(other.umcOrgnStatus))
			return false;
		if (umiOid == null) {
			if (other.umiOid != null)
				return false;
		} else if (!umiOid.equals(other.umiOid))
			return false;
		if (umiOrgnId == null) {
			if (other.umiOrgnId != null)
				return false;
		} else if (!umiOrgnId.equals(other.umiOrgnId))
			return false;
		if (umiOrgnIndex == null) {
			if (other.umiOrgnIndex != null)
				return false;
		} else if (!umiOrgnIndex.equals(other.umiOrgnIndex))
			return false;
		if (umiOrgnLevel == null) {
			if (other.umiOrgnLevel != null)
				return false;
		} else if (!umiOrgnLevel.equals(other.umiOrgnLevel))
			return false;
		if (umiOrgnPrntId == null) {
			if (other.umiOrgnPrntId != null)
				return false;
		} else if (!umiOrgnPrntId.equals(other.umiOrgnPrntId))
			return false;
		if (umvOrgnName == null) {
			if (other.umvOrgnName != null)
				return false;
		} else if (!umvOrgnName.equals(other.umvOrgnName))
			return false;
		return true;
	}
	
	@Column(name="UMV_ORGN_CODE", unique=true, nullable=false)
	public String getUmvOrgnCode() {
		return umvOrgnCode;
	}

	public void setUmvOrgnCode(String umvOrgnCode) {
		this.umvOrgnCode = umvOrgnCode;
	}

	
	
	//////////////////////////adding department address on Monday, January 30 2012
	/*
	 *   orgnaddrline_1 
  orgnaddrline_2_1 
  orgnaddrline_2_2 
  orgnaddrline_3 
  orgnaddrline_country 
  orgnaddrline_district 
  orgnaddrline_state 
  orgnaddrline_village_town 
  orgnemailid 
  
  
  orgnaddrline21 
  orgnaddrline22 
  orgnaddrline3 
  orgnaddrlinecountry 
  orgnaddrlinedistrict 
  orgnaddrlinestate 
  orgnaddrlinevillagetown 
  orgnemailid 

	 * 
	 * 
	 * */
	
	@Column(name="orgnaddrline_2_1")
	public String getOrgnaddrline21() {
		return orgnaddrline21;
	}

	public void setOrgnaddrline21(String orgnaddrline21) {
		this.orgnaddrline21 = orgnaddrline21;
	}

	@Column(name="orgnaddrline_2_2")
	public String getOrgnaddrline22() {
		return orgnaddrline22;
	}

	public void setOrgnaddrline22(String orgnaddrline22) {
		this.orgnaddrline22 = orgnaddrline22;
	}
	
	
	
	@Column(name="orgnaddrlinedistrict")
	public String getOrgnaddrlinedistrict() {
		return orgnaddrlinedistrict;
	}

	public void setOrgnaddrlinedistrict(String orgnaddrlinedistrict) {
		this.orgnaddrlinedistrict = orgnaddrlinedistrict;
	}

	
	@Column(name="orgnaddrlinestate")
	public String getOrgnaddrlinestate() {
		return orgnaddrlinestate;
	}

	public void setOrgnaddrlinestate(String orgnaddrlinestate) {
		this.orgnaddrlinestate = orgnaddrlinestate;
	}

	

	@Column(name="orgnemailid")
	public String getOrgnemailid() {
		return orgnemailid;
	}

	public void setOrgnemailid(String orgnemailid) {
		this.orgnemailid = orgnemailid;
	}
	

	
	
	
	
	
	
	/////////////////////////
	
	
	
	
	
	

}