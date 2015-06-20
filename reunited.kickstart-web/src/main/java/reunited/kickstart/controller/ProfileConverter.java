package reunited.kickstart.controller;

import java.util.ArrayList;
import java.util.List;

import com.reunited.entities.Address;
import com.reunited.entities.PersistenceBase;
import com.reunited.entities.User;

public class ProfileConverter {

	public List<PersistenceBase> getProfileEntity(ProfileBean profileBean) {

		User user = new User();
		Address address = new Address();
		System.out.println(profileBean.getUserFirstName());
		user.setAddress(address);
		user.setUserFirstName(profileBean.getUserFirstName());
		address.setAddressPLine1(profileBean.getAddressPLine1());
		List<PersistenceBase> entities = new ArrayList<PersistenceBase>();
		entities.add(user);
		entities.add(address);
		return entities;
	}

}
