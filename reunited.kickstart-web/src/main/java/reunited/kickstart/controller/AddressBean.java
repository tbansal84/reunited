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
public class AddressBean implements java.io.Serializable {

	private String addressLine1;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

}
