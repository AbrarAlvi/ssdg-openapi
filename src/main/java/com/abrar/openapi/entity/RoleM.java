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
 * RoleM entity.
 */
@SequenceGenerator(name="rolem_seq", sequenceName="slpo_aop.rolem_seq")
@Entity
@Table(name="ume_role_mas", schema="slpo_aop")
public class RoleM  implements java.io.Serializable {
     private static final long serialVersionUID = -863009640573468289L;
	 private Integer umiRoleId;
     private String umvRoleDesc;
     private Integer umiReportRoleId;
     private String umcRoleStatus;
     private String umvIpAddr;
     private String umvMacAddr;
     private String umiOid;
     private String umvRecordAddUser;
     private Timestamp umdRecordAddDate;
     private String umvRecordUpdateUser;
     private Timestamp umdRecordUpdateDate;
     private Set<RoleMenuMap> roleMenuMaps = new HashSet<RoleMenuMap>(0);
     //private Set<RoleUserDesignationMap> roleUserDesignationMaps = new HashSet<RoleUserDesignationMap>(0);

    public RoleM() {
    }

    @Id 
    @GeneratedValue(generator="rolem_seq", strategy=GenerationType.SEQUENCE)
    @Column(name="UMI_ROLE_ID", unique=true, nullable=false)
    public Integer getUmiRoleId() {
        return this.umiRoleId;
    }
    
    public void setUmiRoleId(Integer umiRoleId) {
        this.umiRoleId = umiRoleId;
    }
    
    @Column(name="UMV_ROLE_DESC", length=20)

    public String getUmvRoleDesc() {
        return this.umvRoleDesc;
    }
    
    public void setUmvRoleDesc(String umvRoleDesc) {
        this.umvRoleDesc = umvRoleDesc;
    }
    
    @Column(name="UMI_REPORT_ROLE_ID")

    public Integer getUmiReportRoleId() {
        return this.umiReportRoleId;
    }
    
    public void setUmiReportRoleId(Integer umiReportRoleId) {
        this.umiReportRoleId = umiReportRoleId;
    }
    
    @Column(name="UMC_ROLE_STATUS", nullable=false, length=1)

    public String getUmcRoleStatus() {
        return this.umcRoleStatus;
    }
    
    public void setUmcRoleStatus(String umcRoleStatus) {
        this.umcRoleStatus = umcRoleStatus;
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
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="roleM")
    public Set<RoleMenuMap> getRoleMenuMaps() {
        return this.roleMenuMaps;
    }
    
    public void setRoleMenuMaps(Set<RoleMenuMap> roleMenuMaps) {
        this.roleMenuMaps = roleMenuMaps;
    }
    /*@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="roleM")
    public Set<RoleUserDesignationMap> getRoleUserDesignationMaps() {
        return this.roleUserDesignationMaps;
    }
    
    public void setRoleUserDesignationMaps(Set<RoleUserDesignationMap> roleUserDesignationMaps) {
        this.roleUserDesignationMaps = roleUserDesignationMaps;
    }*/
   
}