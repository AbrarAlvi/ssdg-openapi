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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 * RoleMenuMap entity.
 * File Name  :RoleMenuMap.java
 * Created on :Feb 23, 2011
 * @author    :Sushil Shakya
 */
@SequenceGenerator(name="role_menu_map_seq", sequenceName="slpo_aop.role_menu_map_seq")
@Entity
@Table(name="ume_role_menu_map", schema="slpo_aop")
public class RoleMenuMap  implements java.io.Serializable {
	private static final long serialVersionUID = 8439944285802842743L;
	private Integer umiRoleMenuPk;
     private RoleM roleM;
     private MenuM menuM;
     private String umcRolePrivStatus;
     private String umvRecordAddUser;
     private Timestamp umdRecordAddDate;
     private String umvRecordUpdateUser;
     private Timestamp umdRecordUpdateDate;

    public RoleMenuMap() {
   
    }

	@Id 
	@GeneratedValue(generator="role_menu_map_seq", strategy=GenerationType.SEQUENCE)
    @Column(name="UMI_ROLE_MENU_PK", unique=true, nullable=false)
    public Integer getUmiRoleMenuPk() {
        return this.umiRoleMenuPk;
    }
    
    public void setUmiRoleMenuPk(Integer umiRoleMenuPk) {
        this.umiRoleMenuPk = umiRoleMenuPk;
    }
	
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="UMI_ROLE_ID", nullable=false)
    public RoleM getRoleM() {
        return this.roleM;
    }
    
    public void setRoleM(RoleM roleM) {
        this.roleM = roleM;
    }
	
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="UMI_MENU_ID", nullable=false)
    public MenuM getMenuM() {
        return this.menuM;
    }
    
    public void setMenuM(MenuM menuM) {
        this.menuM = menuM;
    }
    
    @Column(name="UMC_ROLE_PRIV_STATUS", nullable=false, length=1)

    public String getUmcRolePrivStatus() {
        return this.umcRolePrivStatus;
    }
    
    public void setUmcRolePrivStatus(String umcRolePrivStatus) {
        this.umcRolePrivStatus = umcRolePrivStatus;
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

	public String toString() {
		return (umiRoleMenuPk+", "+roleM.getUmiRoleId()+", "+menuM.getUmiMenuId()+", "+umcRolePrivStatus+", "+umvRecordAddUser).toString();
	}
   
}