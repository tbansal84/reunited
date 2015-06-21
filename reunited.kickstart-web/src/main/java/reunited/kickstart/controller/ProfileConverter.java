package reunited.kickstart.controller;

import java.util.ArrayList;
import java.util.List;

import com.reunited.entities.Address;
import com.reunited.entities.PersistenceBase;
import com.reunited.entities.User;

public class ProfileConverter {

	public static List<PersistenceBase> getProfileEntity(ProfileBean profileBean) {

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

	public static ProfileBean getProfileBean(User user) {

		ProfileBean profile = new ProfileBean();
		profile.setUserFirstName(user.getUserFirstName());
		profile.setAddressPLine1(user.getAddress() != null ? "" : user
				.getAddress().getAddressPLine1());
		profile.setId(user.getUserId());

		return profile;

	}

	public static List<ProfileBean> getProfileList(List<User> users) {
		List<ProfileBean> profiles = new ArrayList<ProfileBean>();
		int i=0;
		for (User user : users) {
			profiles.add(getProfileBean(user));
			
		}
		return profiles;
	}
}
