package reunited.kickstart.controller;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "student", eager = true)
@RequestScoped
public class StudentBean implements java.io.Serializable {

	private Integer branchId;
	private String gender;
	private String firstname;
	private String lastname;
	private Date dob;
	private Date joiningdate;
	private Date enddate;
	private Integer addressid;
	private String isuser;
	private String registrationid;

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Integer getAddressid() {
		return addressid;
	}

	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}

	public String getIsuser() {
		return isuser;
	}

	public void setIsuser(String isuser) {
		this.isuser = isuser;
	}

	public String getRegistrationid() {
		return registrationid;
	}

	public void setRegistrationid(String registrationid) {
		this.registrationid = registrationid;
	}

}
