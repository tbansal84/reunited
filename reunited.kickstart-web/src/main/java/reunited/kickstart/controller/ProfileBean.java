package reunited.kickstart.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "profileBean", eager = true)
@SessionScoped
public class ProfileBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String branch;
	private String StringByUserAuthType;
	private String StringByUserStatus;
	private String StringByUserType;
	private String userLoginId;
	private String userEmailAddress;
	private String userRegistrationId;
	private String userJoiningDate;
	private String userTenureEndDate;
	private String userSex;
	private String userFirstName;
	private String userMiddleName;
	private String userSurname;
	private String userDob;
	private String addressId;
	private String addressPLine1;
	private String addressPLine2;
	private String addressPLine3;
	private String addressPCity;
	private String addressPDistrict;
	private String addressPPostString;
	private String addressPState;
	private String addressPCountry;
	private String addressCLine1;
	private String addressCLine2;
	private String addressCLine3;
	private String addressCCity;
	private String addressCDistrict;
	private String addressCPostString;
	private String addressCState;
	private String addressCCountry;
	private String addressLandString;
	private String addressMobile1String;
	private String addressMobile1Number;
	private String addressMobile2String;
	private String addressMobile2Number;
	private String addressFax;
	private String addressEmail1;
	private String addressEmail2;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getStringByUserAuthType() {
		return StringByUserAuthType;
	}
	public void setStringByUserAuthType(String stringByUserAuthType) {
		StringByUserAuthType = stringByUserAuthType;
	}
	public String getStringByUserStatus() {
		return StringByUserStatus;
	}
	public void setStringByUserStatus(String stringByUserStatus) {
		StringByUserStatus = stringByUserStatus;
	}
	public String getStringByUserType() {
		return StringByUserType;
	}
	public void setStringByUserType(String stringByUserType) {
		StringByUserType = stringByUserType;
	}
	public String getUserLoginId() {
		return userLoginId;
	}
	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}
	public String getUserEmailAddress() {
		return userEmailAddress;
	}
	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}
	public String getUserRegistrationId() {
		return userRegistrationId;
	}
	public void setUserRegistrationId(String userRegistrationId) {
		this.userRegistrationId = userRegistrationId;
	}
	
	public String getUserJoiningDate() {
		return userJoiningDate;
	}
	public void setUserJoiningDate(String userJoiningDate) {
		this.userJoiningDate = userJoiningDate;
	}
	public String getUserTenureEndDate() {
		return userTenureEndDate;
	}
	public void setUserTenureEndDate(String userTenureEndDate) {
		this.userTenureEndDate = userTenureEndDate;
	}
	public String getUserSex() {
		return userSex;
	}
	
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserMiddleName() {
		return userMiddleName;
	}
	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	public String getUserDob() {
		return userDob;
	}
	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddressPLine1() {
		return addressPLine1;
	}
	public void setAddressPLine1(String addressPLine1) {
		this.addressPLine1 = addressPLine1;
	}
	public String getAddressPLine2() {
		return addressPLine2;
	}
	public void setAddressPLine2(String addressPLine2) {
		this.addressPLine2 = addressPLine2;
	}
	public String getAddressPLine3() {
		return addressPLine3;
	}
	public void setAddressPLine3(String addressPLine3) {
		this.addressPLine3 = addressPLine3;
	}
	public String getAddressPCity() {
		return addressPCity;
	}
	public void setAddressPCity(String addressPCity) {
		this.addressPCity = addressPCity;
	}
	public String getAddressPDistrict() {
		return addressPDistrict;
	}
	public void setAddressPDistrict(String addressPDistrict) {
		this.addressPDistrict = addressPDistrict;
	}
	public String getAddressPPostString() {
		return addressPPostString;
	}
	public void setAddressPPostString(String addressPPostString) {
		this.addressPPostString = addressPPostString;
	}
	public String getAddressPState() {
		return addressPState;
	}
	public void setAddressPState(String addressPState) {
		this.addressPState = addressPState;
	}
	public String getAddressPCountry() {
		return addressPCountry;
	}
	public void setAddressPCountry(String addressPCountry) {
		this.addressPCountry = addressPCountry;
	}
	public String getAddressCLine1() {
		return addressCLine1;
	}
	public void setAddressCLine1(String addressCLine1) {
		this.addressCLine1 = addressCLine1;
	}
	public String getAddressCLine2() {
		return addressCLine2;
	}
	public void setAddressCLine2(String addressCLine2) {
		this.addressCLine2 = addressCLine2;
	}
	public String getAddressCLine3() {
		return addressCLine3;
	}
	public void setAddressCLine3(String addressCLine3) {
		this.addressCLine3 = addressCLine3;
	}
	public String getAddressCCity() {
		return addressCCity;
	}
	public void setAddressCCity(String addressCCity) {
		this.addressCCity = addressCCity;
	}
	public String getAddressCDistrict() {
		return addressCDistrict;
	}
	public void setAddressCDistrict(String addressCDistrict) {
		this.addressCDistrict = addressCDistrict;
	}
	public String getAddressCPostString() {
		return addressCPostString;
	}
	public void setAddressCPostString(String addressCPostString) {
		this.addressCPostString = addressCPostString;
	}
	public String getAddressCState() {
		return addressCState;
	}
	public void setAddressCState(String addressCState) {
		this.addressCState = addressCState;
	}
	public String getAddressCCountry() {
		return addressCCountry;
	}
	public void setAddressCCountry(String addressCCountry) {
		this.addressCCountry = addressCCountry;
	}
	public String getAddressLandString() {
		return addressLandString;
	}
	public void setAddressLandString(String addressLandString) {
		this.addressLandString = addressLandString;
	}
	public String getAddressMobile1String() {
		return addressMobile1String;
	}
	public void setAddressMobile1String(String addressMobile1String) {
		this.addressMobile1String = addressMobile1String;
	}
	public String getAddressMobile1Number() {
		return addressMobile1Number;
	}
	public void setAddressMobile1Number(String addressMobile1Number) {
		this.addressMobile1Number = addressMobile1Number;
	}
	public String getAddressMobile2String() {
		return addressMobile2String;
	}
	public void setAddressMobile2String(String addressMobile2String) {
		this.addressMobile2String = addressMobile2String;
	}
	public String getAddressMobile2Number() {
		return addressMobile2Number;
	}
	public void setAddressMobile2Number(String addressMobile2Number) {
		this.addressMobile2Number = addressMobile2Number;
	}
	public String getAddressFax() {
		return addressFax;
	}
	public void setAddressFax(String addressFax) {
		this.addressFax = addressFax;
	}
	public String getAddressEmail1() {
		return addressEmail1;
	}
	public void setAddressEmail1(String addressEmail1) {
		this.addressEmail1 = addressEmail1;
	}
	public String getAddressEmail2() {
		return addressEmail2;
	}
	public void setAddressEmail2(String addressEmail2) {
		this.addressEmail2 = addressEmail2;
	}
	
	

}
