package com.abrar.openapi.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * UmvUserPriv entity.
 * File Name  :UmvUserPriv.java
 * Created on :Feb 24, 2011
 * @author    :Sushil Shakya
 */
@Entity
@Table(name = "umv_user_priv4", schema="slpo_aop")
public class UmvUserPriv implements java.io.Serializable {
	private static final long serialVersionUID = 5219163255984759465L;
	
	private Integer umiMenuId;
	private String umvMenuDesc;
	//private String umvMenuTrgt;
	private String umvContextParam;
	private Integer umiRoleId;
	private String umvRoleDesc;
	private Integer umiReportRoleId;
	private String umcRoleStatus;
	//private Integer umiUserId;
	private String umvUserName;
	private String umcUserStatus;
	private String umiReportToId;
	private Integer umiMenuPrnt;
	private Integer umiModId;
	private Short umiMenuLvl;
	private Short umiMenuIdx;
	private String umcMenuStatus;
	private String umcRolePrivStatus;
	//private String umvAddress;
	private String umcGender;
	//private Integer umiScaleId;
	private Integer umiClassId;
	//private Integer umiCadreId;
	private Integer umiGradationListRank;
	private String umvRecordAddUser;
	//private Timestamp umdRecordAddDate;
	private String umvDesigDesc;
	private Integer umiReportDesigId;
	private Short umiDesigLevel;
	private String umiDesigStatus;
	//private Integer umiDesigId;
	//private Integer umiOrgnId;
	private String umvOrgnName;
	private Integer umiOrgnPrntId;
	private Short umiOrgnLevel;
	private Short umiOrgnIndex;
	private String umcOrgnStatus;
	private String umiOid;
	private String umvIpAddr;
	private String recordAddUser;
	//private Timestamp recordAddDate;
	private String umcPndTskFlg;
	private String umvMenuDescHi;
	//private String umvScaleDesc;
	private String umvClassDesc;
	private Integer umiClassIdHigher;
	private String umiClassStatus;
	//private String umcScaleStatus;
	//private Integer umiScaleIdHigher;
	//private String umvCadreDiscription;
	//private Integer umiCadreIdNext;
	//private String umiCadreStatus;
	//private String umvCentralState;
	private String umcMapStatus;
	private UserViewPK primaryKey;
	
	public UmvUserPriv() {
	
	}
	
	@EmbeddedId
	@AttributeOverrides( {
		@AttributeOverride(name = "umiUserId", column = @Column(name = "UMI_USER_ID", nullable = false)),	
		@AttributeOverride(name = "umiOrgnId", column = @Column(name = "UMI_ORGN_ID", nullable = false)),
		@AttributeOverride(name = "umiDesigId", column = @Column(name = "UMI_DESIG_ID", nullable = false)),
			@AttributeOverride(name = "umvMenuTrgt", column = @Column(name = "UMV_MENU_TRGT", length = 65535))})
	public UserViewPK getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(UserViewPK pk) {
		primaryKey = pk;
	}

	@Column(name = "UMI_MENU_ID", nullable = false)
	public Integer getUmiMenuId() {
		return this.umiMenuId;
	}

	public void setUmiMenuId(Integer umiMenuId) {
		this.umiMenuId = umiMenuId;
	}

	@Column(name = "UMV_MENU_DESC", nullable = false, length = 65535)
	public String getUmvMenuDesc() {
		return this.umvMenuDesc;
	}

	public void setUmvMenuDesc(String umvMenuDesc) {
		this.umvMenuDesc = umvMenuDesc;
	}

	/*@Column(name = "UMV_MENU_TRGT", length = 65535)
	public String getUmvMenuTrgt() {
		return this.umvMenuTrgt;
	}

	public void setUmvMenuTrgt(String umvMenuTrgt) {
		this.umvMenuTrgt = umvMenuTrgt;
	}*/

	@Column(name = "UMV_CONTEXT_PARAM", length = 65535)
	public String getUmvContextParam() {
		return this.umvContextParam;
	}

	public void setUmvContextParam(String umvContextParam) {
		this.umvContextParam = umvContextParam;
	}

	@Column(name = "UMI_ROLE_ID", nullable = false)
	public Integer getUmiRoleId() {
		return this.umiRoleId;
	}

	public void setUmiRoleId(Integer umiRoleId) {
		this.umiRoleId = umiRoleId;
	}

	@Column(name = "UMV_ROLE_DESC", length = 20)
	public String getUmvRoleDesc() {
		return this.umvRoleDesc;
	}

	public void setUmvRoleDesc(String umvRoleDesc) {
		this.umvRoleDesc = umvRoleDesc;
	}

	@Column(name = "UMI_REPORT_ROLE_ID")
	public Integer getUmiReportRoleId() {
		return this.umiReportRoleId;
	}

	public void setUmiReportRoleId(Integer umiReportRoleId) {
		this.umiReportRoleId = umiReportRoleId;
	}

	@Column(name = "UMC_ROLE_STATUS", nullable = false, length = 1)
	public String getUmcRoleStatus() {
		return this.umcRoleStatus;
	}

	public void setUmcRoleStatus(String umcRoleStatus) {
		this.umcRoleStatus = umcRoleStatus;
	}

	/*@Column(name = "UMI_USER_ID", nullable = false)
	public Integer getUmiUserId() {
		return this.umiUserId;
	}

	public void setUmiUserId(Integer umiUserId) {
		this.umiUserId = umiUserId;
	}*/

	@Column(name = "UMV_USER_NAME", length = 20)
	public String getUmvUserName() {
		return this.umvUserName;
	}

	public void setUmvUserName(String umvUserName) {
		this.umvUserName = umvUserName;
	}

	@Column(name = "UMC_USER_STATUS", nullable = false, length = 1)
	public String getUmcUserStatus() {
		return this.umcUserStatus;
	}

	public void setUmcUserStatus(String umcUserStatus) {
		this.umcUserStatus = umcUserStatus;
	}

	@Column(name = "UMI_REPORT_TO_ID")
	public String getUmiReportToId() {
		return this.umiReportToId;
	}

	public void setUmiReportToId(String umiReportToId) {
		this.umiReportToId = umiReportToId;
	}

	@Column(name = "UMI_MENU_PRNT", nullable = false)
	public Integer getUmiMenuPrnt() {
		return this.umiMenuPrnt;
	}

	public void setUmiMenuPrnt(Integer umiMenuPrnt) {
		this.umiMenuPrnt = umiMenuPrnt;
	}

	@Column(name = "UMI_MOD_ID")
	public Integer getUmiModId() {
		return this.umiModId;
	}

	public void setUmiModId(Integer umiModId) {
		this.umiModId = umiModId;
	}

	@Column(name = "UMI_MENU_LVL", nullable = false)
	public Short getUmiMenuLvl() {
		return this.umiMenuLvl;
	}

	public void setUmiMenuLvl(Short umiMenuLvl) {
		this.umiMenuLvl = umiMenuLvl;
	}

	@Column(name = "UMI_MENU_IDX", nullable = false)
	public Short getUmiMenuIdx() {
		return this.umiMenuIdx;
	}

	public void setUmiMenuIdx(Short umiMenuIdx) {
		this.umiMenuIdx = umiMenuIdx;
	}

	@Column(name = "UMC_MENU_STATUS", nullable = false, length = 1)
	public String getUmcMenuStatus() {
		return this.umcMenuStatus;
	}

	public void setUmcMenuStatus(String umcMenuStatus) {
		this.umcMenuStatus = umcMenuStatus;
	}

	@Column(name = "UMC_ROLE_PRIV_STATUS", nullable = false, length = 1)
	public String getUmcRolePrivStatus() {
		return this.umcRolePrivStatus;
	}

	public void setUmcRolePrivStatus(String umcRolePrivStatus) {
		this.umcRolePrivStatus = umcRolePrivStatus;
	}

	/*@Column(name = "UMV_ADDRESS")
	public String getUmvAddress() {
		return this.umvAddress;
	}

	public void setUmvAddress(String umvAddress) {
		this.umvAddress = umvAddress;
	}*/

	@Column(name = "UMC_GENDER", length = 1)
	public String getUmcGender() {
		return this.umcGender;
	}

	public void setUmcGender(String umcGender) {
		this.umcGender = umcGender;
	}

	/*@Column(name = "UMI_SCALE_ID")
	public Integer getUmiScaleId() {
		return this.umiScaleId;
	}

	public void setUmiScaleId(Integer umiScaleId) {
		this.umiScaleId = umiScaleId;
	}*/

	@Column(name = "UMI_CLASS_ID")
	public Integer getUmiClassId() {
		return this.umiClassId;
	}

	public void setUmiClassId(Integer umiClassId) {
		this.umiClassId = umiClassId;
	}

	/*@Column(name = "UMI_CADRE_ID")
	public Integer getUmiCadreId() {
		return this.umiCadreId;
	}

	public void setUmiCadreId(Integer umiCadreId) {
		this.umiCadreId = umiCadreId;
	}*/

	@Column(name = "UMI_GRADATION_LIST_RANK")
	public Integer getUmiGradationListRank() {
		return this.umiGradationListRank;
	}

	public void setUmiGradationListRank(Integer umiGradationListRank) {
		this.umiGradationListRank = umiGradationListRank;
	}

	@Column(name = "UMV_RECORD_ADD_USER", length = 20)
	public String getUmvRecordAddUser() {
		return this.umvRecordAddUser;
	}

	public void setUmvRecordAddUser(String umvRecordAddUser) {
		this.umvRecordAddUser = umvRecordAddUser;
	}

	/*@Column(name = "UMD_RECORD_ADD_DATE", length = 19)
	public Timestamp getUmdRecordAddDate() {
		return this.umdRecordAddDate;
	}

	public void setUmdRecordAddDate(Timestamp umdRecordAddDate) {
		this.umdRecordAddDate = umdRecordAddDate;
	}*/

	@Column(name = "UMV_DESIG_DESC", length = 55)
	public String getUmvDesigDesc() {
		return this.umvDesigDesc;
	}

	public void setUmvDesigDesc(String umvDesigDesc) {
		this.umvDesigDesc = umvDesigDesc;
	}

	@Column(name = "UMI_REPORT_DESIG_ID")
	public Integer getUmiReportDesigId() {
		return this.umiReportDesigId;
	}

	public void setUmiReportDesigId(Integer umiReportDesigId) {
		this.umiReportDesigId = umiReportDesigId;
	}

	@Column(name = "UMI_DESIG_LEVEL")
	public Short getUmiDesigLevel() {
		return this.umiDesigLevel;
	}

	public void setUmiDesigLevel(Short umiDesigLevel) {
		this.umiDesigLevel = umiDesigLevel;
	}

	@Column(name = "UMI_DESIG_STATUS", length = 1)
	public String getUmiDesigStatus() {
		return this.umiDesigStatus;
	}

	public void setUmiDesigStatus(String umiDesigStatus) {
		this.umiDesigStatus = umiDesigStatus;
	}

	/*@Column(name = "UMI_DESIG_ID", nullable = false)
	public Integer getUmiDesigId() {
		return this.umiDesigId;
	}

	public void setUmiDesigId(Integer umiDesigId) {
		this.umiDesigId = umiDesigId;
	}

	@Column(name = "UMI_ORGN_ID", nullable = false)
	public Integer getUmiOrgnId() {
		return this.umiOrgnId;
	}

	public void setUmiOrgnId(Integer umiOrgnId) {
		this.umiOrgnId = umiOrgnId;
	}*/

	@Column(name = "UMV_ORGN_NAME", nullable = false, length = 55)
	public String getUmvOrgnName() {
		return this.umvOrgnName;
	}

	public void setUmvOrgnName(String umvOrgnName) {
		this.umvOrgnName = umvOrgnName;
	}

	@Column(name = "UMI_ORGN_PRNT_ID")
	public Integer getUmiOrgnPrntId() {
		return this.umiOrgnPrntId;
	}

	public void setUmiOrgnPrntId(Integer umiOrgnPrntId) {
		this.umiOrgnPrntId = umiOrgnPrntId;
	}

	@Column(name = "UMI_ORGN_LEVEL")
	public Short getUmiOrgnLevel() {
		return this.umiOrgnLevel;
	}

	public void setUmiOrgnLevel(Short umiOrgnLevel) {
		this.umiOrgnLevel = umiOrgnLevel;
	}

	@Column(name = "UMI_ORGN_INDEX")
	public Short getUmiOrgnIndex() {
		return this.umiOrgnIndex;
	}

	public void setUmiOrgnIndex(Short umiOrgnIndex) {
		this.umiOrgnIndex = umiOrgnIndex;
	}

	@Column(name = "UMC_ORGN_STATUS", nullable = false, length = 1)
	public String getUmcOrgnStatus() {
		return this.umcOrgnStatus;
	}

	public void setUmcOrgnStatus(String umcOrgnStatus) {
		this.umcOrgnStatus = umcOrgnStatus;
	}

	@Column(name = "UMI_OID", length = 20)
	public String getUmiOid() {
		return this.umiOid;
	}

	public void setUmiOid(String umiOid) {
		this.umiOid = umiOid;
	}

	@Column(name = "UMV_IP_ADDR", length = 15)
	public String getUmvIpAddr() {
		return this.umvIpAddr;
	}

	public void setUmvIpAddr(String umvIpAddr) {
		this.umvIpAddr = umvIpAddr;
	}

	@Column(name = "RECORD_ADD_USER", length = 20)
	public String getRecordAddUser() {
		return this.recordAddUser;
	}

	public void setRecordAddUser(String recordAddUser) {
		this.recordAddUser = recordAddUser;
	}

	/*@Column(name = "RECORD_ADD_DATE", length = 19)
	public Timestamp getRecordAddDate() {
		return this.recordAddDate;
	}

	public void setRecordAddDate(Timestamp recordAddDate) {
		this.recordAddDate = recordAddDate;
	}*/

	@Column(name = "UMC_PND_TSK_FLG", length = 1)
	public String getUmcPndTskFlg() {
		return this.umcPndTskFlg;
	}

	public void setUmcPndTskFlg(String umcPndTskFlg) {
		this.umcPndTskFlg = umcPndTskFlg;
	}

	@Column(name = "UMV_MENU_DESC_HI", length = 65535)
	public String getUmvMenuDescHi() {
		return this.umvMenuDescHi;
	}

	public void setUmvMenuDescHi(String umvMenuDescHi) {
		this.umvMenuDescHi = umvMenuDescHi;
	}

	/*@Column(name = "UMV_SCALE_DESC", length = 20)
	public String getUmvScaleDesc() {
		return this.umvScaleDesc;
	}

	public void setUmvScaleDesc(String umvScaleDesc) {
		this.umvScaleDesc = umvScaleDesc;
	}*/

	@Column(name = "UMV_CLASS_DESC", length = 20)
	public String getUmvClassDesc() {
		return this.umvClassDesc;
	}

	public void setUmvClassDesc(String umvClassDesc) {
		this.umvClassDesc = umvClassDesc;
	}

	@Column(name = "UMI_CLASS_ID_HIGHER")
	public Integer getUmiClassIdHigher() {
		return this.umiClassIdHigher;
	}

	public void setUmiClassIdHigher(Integer umiClassIdHigher) {
		this.umiClassIdHigher = umiClassIdHigher;
	}

	@Column(name = "UMI_CLASS_STATUS", length = 1)
	public String getUmiClassStatus() {
		return this.umiClassStatus;
	}

	public void setUmiClassStatus(String umiClassStatus) {
		this.umiClassStatus = umiClassStatus;
	}

	@Override
	public String toString() {
		return umvMenuDesc+","+umiClassId+","+getPrimaryKey().getUmvMenuTrgt()+", "+umcMenuStatus+", "+umcPndTskFlg;
	}
	
	@Column(name = "UMC_MAP_STATUS", nullable = false, length = 1)
	public String getUmcMapStatus() {
		return umcMapStatus;
	}

	public void setUmcMapStatus(String umcMapStatus) {
		this.umcMapStatus = umcMapStatus;
	}

	/*@Column(name = "UMC_SCALE_STATUS", nullable = false, length = 1)
	public String getUmcScaleStatus() {
		return this.umcScaleStatus;
	}

	public void setUmcScaleStatus(String umcScaleStatus) {
		this.umcScaleStatus = umcScaleStatus;
	}

	@Column(name = "UMI_SCALE_ID_HIGHER")
	public Integer getUmiScaleIdHigher() {
		return this.umiScaleIdHigher;
	}

	public void setUmiScaleIdHigher(Integer umiScaleIdHigher) {
		this.umiScaleIdHigher = umiScaleIdHigher;
	}

	@Column(name = "UMV_CADRE_DISCRIPTION", length = 20)
	public String getUmvCadreDiscription() {
		return this.umvCadreDiscription;
	}

	public void setUmvCadreDiscription(String umvCadreDiscription) {
		this.umvCadreDiscription = umvCadreDiscription;
	}

	@Column(name = "UMI_CADRE_ID_NEXT")
	public Integer getUmiCadreIdNext() {
		return this.umiCadreIdNext;
	}

	public void setUmiCadreIdNext(Integer umiCadreIdNext) {
		this.umiCadreIdNext = umiCadreIdNext;
	}

	@Column(name = "UMI_CADRE_STATUS", length = 1)
	public String getUmiCadreStatus() {
		return this.umiCadreStatus;
	}

	public void setUmiCadreStatus(String umiCadreStatus) {
		this.umiCadreStatus = umiCadreStatus;
	}

	@Column(name = "UMV_CENTRAL_STATE", length = 20)
	public String getUmvCentralState() {
		return this.umvCentralState;
	}

	public void setUmvCentralState(String umvCentralState) {
		this.umvCentralState = umvCentralState;
	}*/
	
	//private Integer umiUserId;

	//private Integer umiDesigId;	

	//private String umvMenuTrgt;
	
}