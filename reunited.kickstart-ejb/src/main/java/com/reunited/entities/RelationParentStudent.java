package com.reunited.entities;

// Generated May 26, 2015 3:56:20 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RelationParentStudent generated by hbm2java
 */
@Entity
@Table(name = "relation_parent_student", catalog = "reunited")
public class RelationParentStudent implements java.io.Serializable {

	private Integer relationPsId;
	private Code code;
	private User userByRelationPsParentId;
	private User userByRelationPsStudentId;
	private Date lastUpdated;
	private String lastUpdatedBy;

	public RelationParentStudent() {
	}

	public RelationParentStudent(User userByRelationPsParentId,
			User userByRelationPsStudentId) {
		this.userByRelationPsParentId = userByRelationPsParentId;
		this.userByRelationPsStudentId = userByRelationPsStudentId;
	}

	public RelationParentStudent(Code code, User userByRelationPsParentId,
			User userByRelationPsStudentId, Date lastUpdated,
			String lastUpdatedBy) {
		this.code = code;
		this.userByRelationPsParentId = userByRelationPsParentId;
		this.userByRelationPsStudentId = userByRelationPsStudentId;
		this.lastUpdated = lastUpdated;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RELATION_PS_ID", unique = true, nullable = false)
	public Integer getRelationPsId() {
		return this.relationPsId;
	}

	public void setRelationPsId(Integer relationPsId) {
		this.relationPsId = relationPsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RELATION_PS_TYPE")
	public Code getCode() {
		return this.code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RELATION_PS_PARENT_ID", nullable = false)
	public User getUserByRelationPsParentId() {
		return this.userByRelationPsParentId;
	}

	public void setUserByRelationPsParentId(User userByRelationPsParentId) {
		this.userByRelationPsParentId = userByRelationPsParentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RELATION_PS_STUDENT_ID", nullable = false)
	public User getUserByRelationPsStudentId() {
		return this.userByRelationPsStudentId;
	}

	public void setUserByRelationPsStudentId(User userByRelationPsStudentId) {
		this.userByRelationPsStudentId = userByRelationPsStudentId;
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
