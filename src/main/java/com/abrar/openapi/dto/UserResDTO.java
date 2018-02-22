/**
 * File Name  :UserResDTO.java
 * Created on :Feb 24, 2011
 * @author    :Sushil Shakya
 */
package com.abrar.openapi.dto;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.abrar.openapi.entity.CustomMenuUserMap;
import com.abrar.openapi.entity.DesignationM;
import com.abrar.openapi.entity.LogInUser;
import com.abrar.openapi.entity.OrganizationM;
import com.abrar.openapi.entity.UmvUserPriv;
import com.abrar.openapi.entity.UserDesigOrganizationMap;

public class UserResDTO {
	
	private static final Logger log = Logger.getLogger(UserResDTO.class);
	
	private String userId;
	private String userPwd;
	private int deptId;
	private int deptParentId;
	private int selDeptId;
	private int desigId;
	private int reportDesigId;
	private String reportToUserId;
	private int roleId;
	private int roleParentId;
	private String userName;
	private String deptName;
	private String desigName;
	private String roleName;
	private boolean isDualDept;
	private boolean isDualDesig;
	private boolean isDualRole;
	
	private OrganizationM organizationM;
	private DesignationM designationM;
	private LogInUser logInUser;
	
	private List<OrganizationM> deptList;
	private List<OrganizationM> allDeptList;
	private List<DesignationM> desigList;
	private List<LogInUser> userList;
	private List<LogInUser> allUserList;
	/* Added on 1st march 2011 */
	private List<LogInUser> scannerUserList;
	private List<LogInUser> dealingUserList;
	private List<UmvUserPriv> userPrivList;
	private List<UserDesigOrganizationMap> userDoMapList;
	/* Added on 2nd march 2011 */
	private List<UserDesigOrganizationMap> userDoMapAllList;
	private String flag;
	private String errorMsg;
	/* Added on 19th april 2011 */
	private List<LogInUser> supList;
	private List<LogInUser> officersList;
	private List<LogInUser> dealingAsstListForOwnDept;
	private Set roleSet;
	/* Added by Abrar for Custom Actions */ 
	private List<CustomMenuUserMap> menuUserList;
	
	
	
	public List<CustomMenuUserMap> getMenuUserList() {
		return menuUserList;
	}
	public void setMenuUserList(List<CustomMenuUserMap> menuUserList) {
		this.menuUserList = menuUserList;
	}
	public List<OrganizationM> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<OrganizationM> deptList) {
		this.deptList = deptList;
	}
	public List<DesignationM> getDesigList() {
		return desigList;
	}
	public void setDesigList(List<DesignationM> desigList) {
		this.desigList = desigList;
	}
	public List<LogInUser> getUserList() {
		return userList;
	}
	public void setUserList(List<LogInUser> userList) {
		this.userList = userList;
	}
	
    public List<UmvUserPriv> getUserPrivList() {
		return userPrivList;
	}

	public void setUserPrivList(List<UmvUserPriv> userPrivList) {
		this.userPrivList = userPrivList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getDesigId() {
		return desigId;
	}
	public void setDesigId(int desigId) {
		this.desigId = desigId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public OrganizationM getOrganizationM() {
		return organizationM;
	}
	public void setOrganizationM(OrganizationM organizationM) {
		this.organizationM = organizationM;
	}
	public DesignationM getDesignationM() {
		return designationM;
	}
	public void setDesignationM(DesignationM designationM) {
		this.designationM = designationM;
	}
	public LogInUser getLogInUser() {
		return logInUser;
	}
	public void setLogInUser(LogInUser logInUser) {
		this.logInUser = logInUser;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDesigName() {
		return desigName;
	}
	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public boolean isDualDept() {
		return isDualDept;
	}
	public void setDualDept(boolean isDualDept) {
		this.isDualDept = isDualDept;
	}
	public boolean isDualDesig() {
		return isDualDesig;
	}
	public void setDualDesig(boolean isDualDesig) {
		this.isDualDesig = isDualDesig;
	}
	public boolean isDualRole() {
		return isDualRole;
	}
	public void setDualRole(boolean isDualRole) {
		this.isDualRole = isDualRole;
	}
	public int getSelDeptId() {
		return selDeptId;
	}
	public void setSelDeptId(int selDeptId) {
		this.selDeptId = selDeptId;
	}
	public List<OrganizationM> getAllDeptList() {
		return allDeptList;
	}
	public void setAllDeptList(List<OrganizationM> allDeptList) {
		this.allDeptList = allDeptList;
	}
	@Override
	public String toString() {
		//log.debug("userId->"+userId+", deptId->"+deptId+", desigId->"+desigId+", roleId->"+roleId+", selDeptId->"+selDeptId);
		//log.debug("userName->"+userName+", deptName->"+deptName+", desigName->"+desigName+", roleName->"+roleName);
		return "";
	}
	public List<UserDesigOrganizationMap> getUserDoMapList() {
		return userDoMapList;
	}
	public void setUserDoMapList(List<UserDesigOrganizationMap> userDoMapList) {
		this.userDoMapList = userDoMapList;
	}
	public int getDeptParentId() {
		return deptParentId;
	}
	public void setDeptParentId(int deptParentId) {
		this.deptParentId = deptParentId;
	}
	public int getRoleParentId() {
		return roleParentId;
	}
	public void setRoleParentId(int roleParentId) {
		this.roleParentId = roleParentId;
	}
	public int getReportDesigId() {
		return reportDesigId;
	}
	public void setReportDesigId(int reportDesigId) {
		this.reportDesigId = reportDesigId;
	}
	public List<LogInUser> getScannerUserList() {
		return scannerUserList;
	}
	public void setScannerUserList(List<LogInUser> scannerUserList) {
		this.scannerUserList = scannerUserList;
	}
	public List<LogInUser> getDealingUserList() {
		return dealingUserList;
	}
	public void setDealingUserList(List<LogInUser> dealingUserList) {
		this.dealingUserList = dealingUserList;
	}
	public List<UserDesigOrganizationMap> getUserDoMapAllList() {
		return userDoMapAllList;
	}
	public void setUserDoMapAllList(List<UserDesigOrganizationMap> userDoMapAllList) {
		this.userDoMapAllList = userDoMapAllList;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getReportToUserId() {
		return reportToUserId;
	}
	public void setReportToUserId(String reportToUserId) {
		this.reportToUserId = reportToUserId;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public List<LogInUser> getSupList() {
		return supList;
	}
	public void setSupList(List<LogInUser> supList) {
		this.supList = supList;
	}
	public List<LogInUser> getOfficersList() {
		return officersList;
	}
	public void setOfficersList(List<LogInUser> officersList) {
		this.officersList = officersList;
	}
	public Set getRoleSet() {
		return roleSet;
	}
	public void setRoleSet(Set roleSet) {
		this.roleSet = roleSet;
	}
	public List<LogInUser> getAllUserList() {
		return allUserList;
	}
	public void setAllUserList(List<LogInUser> allUserList) {
		this.allUserList = allUserList;
	}
	public List<LogInUser> getDealingAsstListForOwnDept() {
		return dealingAsstListForOwnDept;
	}
	public void setDealingAsstListForOwnDept(
			List<LogInUser> dealingAsstListForOwnDept) {
		this.dealingAsstListForOwnDept = dealingAsstListForOwnDept;
	}
	
	
	
}