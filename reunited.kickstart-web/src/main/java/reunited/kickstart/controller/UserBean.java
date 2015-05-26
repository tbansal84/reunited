package reunited.kickstart.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.reunited.entities.Address;
import com.reunited.entities.Branch;
import com.reunited.entities.Code;

@ManagedBean(name = "student", eager = true)
@RequestScoped
public class UserBean implements java.io.Serializable {
	
	private String firstName;
	private String middleName;
	private String surName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	
	
	
	
}
