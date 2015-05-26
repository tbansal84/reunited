package reunited.kickstart.convertandsave;

import reunited.kickstart.controller.UserBean;

import com.reunited.entities.Student;

public class StudentConverter {

	public Student getStudentEntity(UserBean student){
		return new Student();
	}
}
