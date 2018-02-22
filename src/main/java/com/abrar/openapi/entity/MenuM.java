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
 * MenuM entity.
 * File Name  :MenuM.java
 * Created on :Feb 23, 2011
 * @author    :Sushil Shakya
 */
@SequenceGenerator(name="menum_seq", sequenceName="slpo_aop.menum_seq")
@Entity
@Table(name="ume_menu_mas", schema="slpo_aop")
public class MenuM  implements java.io.Serializable {
	 private static final long serialVersionUID = -4623839097646643708L;
	 private Integer umiMenuId;
     private Integer umiModId;
     private Integer umiMenuPrnt;
     private Integer umiMenuLvl;
     private Integer umiMenuIdx;
     private String umvMenuDesc;
     private String umvMenuTrgt;
     private String umvContextParam;
     private String umvMenuDescHi;
     private String umcPndTskFlg;
     private String umcMenuStatus;
     private String umvIpAddr;
     private String umvMacAddr;
     private String umvRecordAddUser;
     private Timestamp umdRecordAddDate;
     private String umvRecordUpdateUser;
     private Timestamp umdRecordUpdateDate;
     private Set<RoleMenuMap> roleMenuMaps = new HashSet<RoleMenuMap>(0);

    public MenuM() {
    }

    @Id 
    @GeneratedValue(generator="menum_seq", strategy=GenerationType.SEQUENCE)
    @Column(name="UMI_MENU_ID", unique=true, nullable=false)
    public Integer getUmiMenuId() {
        return this.umiMenuId;
    }
    
    public void setUmiMenuId(Integer umiMenuId) {
        this.umiMenuId = umiMenuId;
    }
    
    @Column(name="UMI_MOD_ID")

    public Integer getUmiModId() {
        return this.umiModId;
    }
    
    public void setUmiModId(Integer umiModId) {
        this.umiModId = umiModId;
    }
    
    @Column(name="UMI_MENU_PRNT")

    public Integer getUmiMenuPrnt() {
        return this.umiMenuPrnt;
    }
    
    public void setUmiMenuPrnt(Integer umiMenuPrnt) {
        this.umiMenuPrnt = umiMenuPrnt;
    }
    
    @Column(name="UMI_MENU_LVL")

    public Integer getUmiMenuLvl() {
        return this.umiMenuLvl;
    }
    
    public void setUmiMenuLvl(Integer umiMenuLvl) {
        this.umiMenuLvl = umiMenuLvl;
    }
    
    @Column(name="UMI_MENU_IDX")

    public Integer getUmiMenuIdx() {
        return this.umiMenuIdx;
    }
    
    public void setUmiMenuIdx(Integer umiMenuIdx) {
        this.umiMenuIdx = umiMenuIdx;
    }
    
    @Column(name="UMV_MENU_DESC", nullable=false, length=65535)

    public String getUmvMenuDesc() {
        return this.umvMenuDesc;
    }
    
    public void setUmvMenuDesc(String umvMenuDesc) {
        this.umvMenuDesc = umvMenuDesc;
    }
    
    @Column(name="UMV_MENU_TRGT", length=65535)

    public String getUmvMenuTrgt() {
        return this.umvMenuTrgt;
    }
    
    public void setUmvMenuTrgt(String umvMenuTrgt) {
        this.umvMenuTrgt = umvMenuTrgt;
    }
    
    @Column(name="UMV_CONTEXT_PARAM", length=65535)

    public String getUmvContextParam() {
        return this.umvContextParam;
    }
    
    public void setUmvContextParam(String umvContextParam) {
        this.umvContextParam = umvContextParam;
    }
    
    @Column(name="UMV_MENU_DESC_HI", length=65535)

    public String getUmvMenuDescHi() {
        return this.umvMenuDescHi;
    }
    
    public void setUmvMenuDescHi(String umvMenuDescHi) {
        this.umvMenuDescHi = umvMenuDescHi;
    }
    
    @Column(name="UMC_PND_TSK_FLG", length=1)

    public String getUmcPndTskFlg() {
        return this.umcPndTskFlg;
    }
    
    public void setUmcPndTskFlg(String umcPndTskFlg) {
        this.umcPndTskFlg = umcPndTskFlg;
    }
    
    @Column(name="UMC_MENU_STATUS", nullable=false, length=1)

    public String getUmcMenuStatus() {
        return this.umcMenuStatus;
    }
    
    public void setUmcMenuStatus(String umcMenuStatus) {
        this.umcMenuStatus = umcMenuStatus;
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
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="menuM")

    public Set<RoleMenuMap> getRoleMenuMaps() {
        return this.roleMenuMaps;
    }
    
    public void setRoleMenuMaps(Set<RoleMenuMap> roleMenuMaps) {
        this.roleMenuMaps = roleMenuMaps;
    }

}