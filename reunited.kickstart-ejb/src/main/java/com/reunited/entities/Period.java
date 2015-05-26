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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Period generated by hbm2java
 */
@Entity
@Table(name = "period", catalog = "reunited")
public class Period implements java.io.Serializable {

	private Integer periodId;
	private String periodName;
	private Date periodFromTime;
	private Date periodToTime;

	public Period() {
	}

	public Period(String periodName) {
		this.periodName = periodName;
	}

	public Period(String periodName, Date periodFromTime, Date periodToTime,
			Set timetables) {
		this.periodName = periodName;
		this.periodFromTime = periodFromTime;
		this.periodToTime = periodToTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PERIOD_ID", unique = true, nullable = false)
	public Integer getPeriodId() {
		return this.periodId;
	}

	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}

	@Column(name = "PERIOD_NAME", nullable = false, length = 10)
	public String getPeriodName() {
		return this.periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "PERIOD_FROM_TIME", length = 8)
	public Date getPeriodFromTime() {
		return this.periodFromTime;
	}

	public void setPeriodFromTime(Date periodFromTime) {
		this.periodFromTime = periodFromTime;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "PERIOD_TO_TIME", length = 8)
	public Date getPeriodToTime() {
		return this.periodToTime;
	}

	public void setPeriodToTime(Date periodToTime) {
		this.periodToTime = periodToTime;
	}


}
