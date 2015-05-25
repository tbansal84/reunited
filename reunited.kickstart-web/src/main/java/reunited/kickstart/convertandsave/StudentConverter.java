package reunited.kickstart.convertandsave;

import reunited.kickstart.controller.StudentBean;
import reunited.kickstart.model.Student;

public class StudentConverter {

	public Student getStudentEntity(StudentBean student){
		return new Student(student.getBranchId()
				, student.getGender(), student.getFirstname(), student.getLastname(), 
				student.getDob(), student.getJoiningdate(), student.getEnddate(), student.getAddressid(), student.getIsuser()
				, student.getRegistrationid());
	}
}
