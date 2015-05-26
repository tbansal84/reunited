package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "reunited")
public class User implements java.io.Serializable {

	private Integer userId;
	private Address address;
	private Branch branch;
	private Code codeByUserAuthType;
	private Code codeByUserStatus;
	private Code codeByUserType;
	private String userLoginId;
	private String userEmailAddress;
	private String userRegistrationId;
	private Date userJoiningDate;
	private Date userTenureEndDate;
	private Character userSex;
	private String userFirstName;
	private String userMiddleName;
	private String userSurname;
	private Date userDob;
	private Date lastUpdated;
	private String lastUpdatedBy;

	public User() {
	}

	public User(Code codeByUserType, String userLoginId) {
		this.codeByUserType = codeByUserType;
		this.userLoginId = userLoginId;
	}

	public User(Address address, Branch branch, Code codeByUserAuthType,
			Code codeByUserStatus, Code codeByUserType, String userLoginId,
			String userEmailAddress, String userRegistrationId,
			Date userJoiningDate, Date userTenureEndDate, Character userSex,
			String userFirstName, String userMiddleName, String userSurname,
			Date userDob, Date lastUpdated, String lastUpdatedBy, Set students,
			Set attendences, Set sessions, Set relationSessionStudents,
			Set relationParentStudentsForRelationPsParentId, Set timetables,
			Set userPinHistories,
			Set relationParentStudentsForRelationPsStudentId, Set testResults) {
		this.address = address;
		this.branch = branch;
		this.codeByUserAuthType = codeByUserAuthType;
		this.codeByUserStatus = codeByUserStatus;
		this.codeByUserType = codeByUserType;
		this.userLoginId = userLoginId;
		this.userEmailAddress = userEmailAddress;
		this.userRegistrationId = userRegistrationId;
		this.userJoiningDate = userJoiningDate;
		this.userTenureEndDate = userTenureEndDate;
		this.userSex = userSex;
		this.userFirstName = userFirstName;
		this.userMiddleName = userMiddleName;
		this.userSurname = userSurname;
		this.userDob = userDob;
		this.lastUpdated = lastUpdated;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "USER_ID", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ADDRESS_ID")
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_BRANCH_ID")
	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_AUTH_TYPE")
	public Code getCodeByUserAuthType() {
		return this.codeByUserAuthType;
	}

	public void setCodeByUserAuthType(Code codeByUserAuthType) {
		this.codeByUserAuthType = codeByUserAuthType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_STATUS")
	public Code getCodeByUserStatus() {
		return this.codeByUserStatus;
	}

	public void setCodeByUserStatus(Code codeByUserStatus) {
		this.codeByUserStatus = codeByUserStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_TYPE", nullable = false)
	public Code getCodeByUserType() {
		return this.codeByUserType;
	}

	public void setCodeByUserType(Code codeByUserType) {
		this.codeByUserType = codeByUserType;
	}

	@Column(name = "USER_LOGIN_ID", nullable = false, length = 45)
	public String getUserLoginId() {
		return this.userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	@Column(name = "USER_EMAIL_ADDRESS", length = 45)
	public String getUserEmailAddress() {
		return this.userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}

	@Column(name = "USER_REGISTRATION_ID", length = 15)
	public String getUserRegistrationId() {
		return this.userRegistrationId;
	}

	public void setUserRegistrationId(String userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "USER_JOINING_DATE", length = 10)
	public Date getUserJoiningDate() {
		return this.userJoiningDate;
	}

	public void setUserJoiningDate(Date userJoiningDate) {
		this.userJoiningDate = userJoiningDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "USER_TENURE_END_DATE", length = 10)
	public Date getUserTenureEndDate() {
		return this.userTenureEndDate;
	}

	public void setUserTenureEndDate(Date userTenureEndDate) {
		this.userTenureEndDate = userTenureEndDate;
	}

	@Column(name = "USER_SEX", length = 1)
	public Character getUserSex() {
		return this.userSex;
	}

	public void setUserSex(Character userSex) {
		this.userSex = userSex;
	}

	@Column(name = "USER_FIRST_NAME", length = 20)
	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	@Column(name = "USER_MIDDLE_NAME", length = 20)
	public String getUserMiddleName() {
		return this.userMiddleName;
	}

	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}

	@Column(name = "USER_SURNAME", length = 20)
	public String getUserSurname() {
		return this.userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "USER_DOB", length = 10)
	public Date getUserDob() {
		return this.userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED", length = 19)
	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Column(name = "LAST_UPDATED_BY", length = 45)
	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}




}