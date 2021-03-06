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
 * Test generated by hbm2java
 */
@Entity
@Table(name = "test", catalog = "reunited")
public class Test implements java.io.Serializable {

	private Integer testId;
	private Code codeByTestSubjectId;
	private Code codeByTestType;
	private Session session;
	private int testHighestMarks;
	private Date testDate;
	private Date lastUpdated;
	private String lastUpdatedBy;
	private Set<TestResult> testResults = new HashSet<TestResult>(0);

	public Test() {
	}

	public Test(Code codeByTestSubjectId, Code codeByTestType, Session session,
			int testHighestMarks) {
		this.codeByTestSubjectId = codeByTestSubjectId;
		this.codeByTestType = codeByTestType;
		this.session = session;
		this.testHighestMarks = testHighestMarks;
	}

	public Test(Code codeByTestSubjectId, Code codeByTestType, Session session,
			int testHighestMarks, Date testDate, Date lastUpdated,
			String lastUpdatedBy, Set testResults) {
		this.codeByTestSubjectId = codeByTestSubjectId;
		this.codeByTestType = codeByTestType;
		this.session = session;
		this.testHighestMarks = testHighestMarks;
		this.testDate = testDate;
		this.lastUpdated = lastUpdated;
		this.lastUpdatedBy = lastUpdatedBy;
		this.testResults = testResults;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "TEST_ID", unique = true, nullable = false)
	public Integer getTestId() {
		return this.testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEST_SUBJECT_ID", nullable = false)
	public Code getCodeByTestSubjectId() {
		return this.codeByTestSubjectId;
	}

	public void setCodeByTestSubjectId(Code codeByTestSubjectId) {
		this.codeByTestSubjectId = codeByTestSubjectId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEST_TYPE", nullable = false)
	public Code getCodeByTestType() {
		return this.codeByTestType;
	}

	public void setCodeByTestType(Code codeByTestType) {
		this.codeByTestType = codeByTestType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEST_SESSION_ID", nullable = false)
	public Session getSession() {
		return this.session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@Column(name = "TEST_HIGHEST_MARKS", nullable = false)
	public int getTestHighestMarks() {
		return this.testHighestMarks;
	}

	public void setTestHighestMarks(int testHighestMarks) {
		this.testHighestMarks = testHighestMarks;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TEST_DATE", length = 10)
	public Date getTestDate() {
		return this.testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TestResult> getTestResults() {
		return this.testResults;
	}

	public void setTestResults(Set<TestResult> testResults) {
		this.testResults = testResults;
	}

}
