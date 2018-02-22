package com.abrar.openapi.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * UserM entity.
 * File Name  :UserM.java
 * Created on :April 4, 2011
 * @author    :Sushil Shakya
 */
@SequenceGenerator(name="userm_seq", sequenceName="slpo_aop.userm_seq")
@Entity
@Table(name = "ume_user_master", schema="slpo_aop")
public class LogInUser implements java.io.Serializable {
	private Integer umiUserPk;
	private String umiUserId;
	private String umvUserName;
	private String umvFatherName;
	private UmeAddressDtl umiAddressId;
	private String umcGender;
	private CadreM cadreM;
	private ClassM classM;
	private ScaleM scaleM;
	private Integer umiGradationListRank;
	private String umcUserStatus;
	private String umvIpAddr;
	private String umvMacAddr;
	private String umiOid;
	private String umvRecordAddUser;
	private Timestamp umdRecordAddDate;
	private String umvRecordUpdateUser;
	private Timestamp umdRecordUpdateDate;
	private String umvUserPwd;
	private String doBirth;
	
	///address integration
    private String currentaddrline1;
    private String currentaddrline21;
    private String currentaddrline22;
    private String currentaddrline3;
    private String currentaddrlineCountry;
    private String currentaddrlineDistrict;
    private String currentaddrlinePin;
    private String currentaddrlineState;
    private String currentaddrlineVillageTown;
    private String permanentaddrline1;
    private String permanentaddrline21;
    private String permanentaddrline22;
    private String permanentaddrline3;
    private String permanentaddrlineCountry;
    private String permanentaddrlineDistrict;
    private String permanentaddrlinePin;
    private String permanentaddrlineState;
    private String permanentaddrlineVillageTown;
	//end address integration
    
    //start digital sign integration
    private String digitalSignatureKeyString;
    @Transient
    private String designation;
    //end digital sign integration
    
    
    
    
    
	
	public LogInUser() {
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Id
	@GeneratedValue(generator="userm_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "UMI_USER_PK", unique = true, nullable = false)
	public Integer getUmiUserPk() {
		return this.umiUserPk;
	}

	public void setUmiUserPk(Integer umiUserPk) {
		this.umiUserPk = umiUserPk;
	}
	
	@Column(name = "UMI_USER_ID", nullable = false, unique = true)
	public String getUmiUserId() {
		return this.umiUserId;
	}

	public void setUmiUserId(String umiUserId) {
		this.umiUserId = umiUserId;
	}

	@Column(name = "UMV_USER_NAME", length = 255)
	public String getUmvUserName() {
		return this.umvUserName;
	}

	public void setUmvUserName(String umvUserName) {
		this.umvUserName = umvUserName;
	}
	
	@Column(name = "UMV_FATHER_NAME", length = 255)
	public String getUmvFatherName() {
		return umvFatherName;
	}

	public void setUmvFatherName(String umvFatherName) {
		this.umvFatherName = umvFatherName;
	}

	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="UMI_ADDRESS_ID", referencedColumnName="UMI_ADDRESS_PK", insertable=true, updatable=false)
	public UmeAddressDtl getUmiAddressId() {
		return this.umiAddressId;
	}

	public void setUmiAddressId(UmeAddressDtl umiAddressId) {
		this.umiAddressId = umiAddressId;
	}

	@Column(name = "UMC_GENDER", length = 1)
	public String getUmcGender() {
		return this.umcGender;
	}

	public void setUmcGender(String umcGender) {
		this.umcGender = umcGender;
	}

	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UMI_CADRE_ID")

    public CadreM getCadreM() {
        return this.cadreM;
    }
    
    public void setCadreM(CadreM cadreM) {
        this.cadreM = cadreM;
    }
	
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UMI_CLASS_ID")
    public ClassM getClassM() {
        return this.classM;
    }
    
    public void setClassM(ClassM classM) {
        this.classM = classM;
    }
    
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UMI_SCALE_ID")
    public ScaleM getScaleM() {
        return this.scaleM;
    }
    
    public void setScaleM(ScaleM scaleM) {
        this.scaleM = scaleM;
    }

	@Column(name = "UMI_GRADATION_LIST_RANK")
	public Integer getUmiGradationListRank() {
		return this.umiGradationListRank;
	}

	public void setUmiGradationListRank(Integer umiGradationListRank) {
		this.umiGradationListRank = umiGradationListRank;
	}

	@Column(name = "UMC_USER_STATUS", nullable = false, length = 1)
	public String getUmcUserStatus() {
		return this.umcUserStatus;
	}

	public void setUmcUserStatus(String umcUserStatus) {
		this.umcUserStatus = umcUserStatus;
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

	@Column(name = "UMV_RECORD_ADD_USER", nullable = false, length = 20)
	public String getUmvRecordAddUser() {
		return this.umvRecordAddUser;
	}

	public void setUmvRecordAddUser(String umvRecordAddUser) {
		this.umvRecordAddUser = umvRecordAddUser;
	}

	@Column(name = "UMD_RECORD_ADD_DATE", nullable = false, length = 19)
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

	@Column(name = "UMV_USER_PWD")
	public String getUmvUserPwd() {
		return this.umvUserPwd;
	}

	public void setUmvUserPwd(String umvUserPwd) {
		this.umvUserPwd = umvUserPwd;
	}
	
	@Column(name = "UMD_DOB")
	public String getDoBirth() {
		return doBirth;
	}

	public void setDoBirth(String doBirth) {
		this.doBirth = doBirth;
	}
	
	////user address integration
	
    
    @Column(name="currentaddrline_1", length=60)
    public String getCurrentaddrline1() {
        return this.currentaddrline1;
    }
    
    public void setCurrentaddrline1(String currentaddrline1) {
        this.currentaddrline1 = currentaddrline1;
    }
    
    @Column(name="currentaddrline_2_1", length=60)
    public String getCurrentaddrline21() {
        return this.currentaddrline21;
    }
    
    public void setCurrentaddrline21(String currentaddrline21) {
        this.currentaddrline21 = currentaddrline21;
    }
    
    @Column(name="currentaddrline_2_2", length=60)
    public String getCurrentaddrline22() {
        return this.currentaddrline22;
    }
    
    public void setCurrentaddrline22(String currentaddrline22) {
        this.currentaddrline22 = currentaddrline22;
    }
    
    @Column(name="currentaddrline_3", length=60)
    public String getCurrentaddrline3() {
        return this.currentaddrline3;
    }
    
    public void setCurrentaddrline3(String currentaddrline3) {
        this.currentaddrline3 = currentaddrline3;
    }
    
    @Column(name="currentaddrline_country", length=50)
    public String getCurrentaddrlineCountry() {
        return this.currentaddrlineCountry;
    }
    
    public void setCurrentaddrlineCountry(String currentaddrlineCountry) {
        this.currentaddrlineCountry = currentaddrlineCountry;
    }
    
    @Column(name="currentaddrline_district", length=50)
    public String getCurrentaddrlineDistrict() {
        return this.currentaddrlineDistrict;
    }
    
    public void setCurrentaddrlineDistrict(String currentaddrlineDistrict) {
        this.currentaddrlineDistrict = currentaddrlineDistrict;
    }
    
    @Column(name="currentaddrline_pin", length=50)
    public String getCurrentaddrlinePin() {
        return this.currentaddrlinePin;
    }
    
    public void setCurrentaddrlinePin(String currentaddrlinePin) {
        this.currentaddrlinePin = currentaddrlinePin;
    }
    
    @Column(name="currentaddrline_state", length=50)
    public String getCurrentaddrlineState() {
        return this.currentaddrlineState;
    }
    
    public void setCurrentaddrlineState(String currentaddrlineState) {
        this.currentaddrlineState = currentaddrlineState;
    }
    
    @Column(name="currentaddrline_village_town", length=50)
    public String getCurrentaddrlineVillageTown() {
        return this.currentaddrlineVillageTown;
    }
    
    public void setCurrentaddrlineVillageTown(String currentaddrlineVillageTown) {
        this.currentaddrlineVillageTown = currentaddrlineVillageTown;
    }
    
    @Column(name="permanentaddrline_1", length=60)
    public String getPermanentaddrline1() {
        return this.permanentaddrline1;
    }
    
    public void setPermanentaddrline1(String permanentaddrline1) {
        this.permanentaddrline1 = permanentaddrline1;
    }
    
    @Column(name="permanentaddrline_2_1", length=60)
    public String getPermanentaddrline21() {
        return this.permanentaddrline21;
    }
    
    public void setPermanentaddrline21(String permanentaddrline21) {
        this.permanentaddrline21 = permanentaddrline21;
    }
    
    @Column(name="permanentaddrline_2_2", length=60)
    public String getPermanentaddrline22() {
        return this.permanentaddrline22;
    }
    
    public void setPermanentaddrline22(String permanentaddrline22) {
        this.permanentaddrline22 = permanentaddrline22;
    }
    
    @Column(name="permanentaddrline_3", length=60)
    public String getPermanentaddrline3() {
        return this.permanentaddrline3;
    }
    
    public void setPermanentaddrline3(String permanentaddrline3) {
        this.permanentaddrline3 = permanentaddrline3;
    }
    
    @Column(name="permanentaddrline_country", length=50)
    public String getPermanentaddrlineCountry() {
        return this.permanentaddrlineCountry;
    }
    
    public void setPermanentaddrlineCountry(String permanentaddrlineCountry) {
        this.permanentaddrlineCountry = permanentaddrlineCountry;
    }
    
    @Column(name="permanentaddrline_district", length=50)
    public String getPermanentaddrlineDistrict() {
        return this.permanentaddrlineDistrict;
    }
    
    public void setPermanentaddrlineDistrict(String permanentaddrlineDistrict) {
        this.permanentaddrlineDistrict = permanentaddrlineDistrict;
    }
    
    @Column(name="permanentaddrline_pin", length=50)
    public String getPermanentaddrlinePin() {
        return this.permanentaddrlinePin;
    }
    
    public void setPermanentaddrlinePin(String permanentaddrlinePin) {
        this.permanentaddrlinePin = permanentaddrlinePin;
    }
    
    @Column(name="permanentaddrline_state", length=50)
    public String getPermanentaddrlineState() {
        return this.permanentaddrlineState;
    }
    
    public void setPermanentaddrlineState(String permanentaddrlineState) {
        this.permanentaddrlineState = permanentaddrlineState;
    }
    
    @Column(name="permanentaddrline_village_town", length=50)
    public String getPermanentaddrlineVillageTown() {
        return this.permanentaddrlineVillageTown;
    }
    
    public void setPermanentaddrlineVillageTown(String permanentaddrlineVillageTown) {
        this.permanentaddrlineVillageTown = permanentaddrlineVillageTown;
    }



	
	////end user address integration
	
    
    //digital signature user key integration
    @Column(name="digital_signature_key_string")
    public String getDigitalSignatureKeyString() {
        return this.digitalSignatureKeyString;
    }
    
    public void setDigitalSignatureKeyString(String digitalSignatureKeyString) {
        this.digitalSignatureKeyString = digitalSignatureKeyString;
    }
    //end digital signature user key integration

	
}