package org.jdsystem.studentinfobackend;

import org.jdsystem.studentinfobackend.model.Student;
import org.jdsystem.studentinfobackend.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentInfoBackEndApplicationTests {
	@Autowired
	StudentService studentService;

	@Test
	void contextLoads() {
<<<<<<< HEAD
		long id = 1;
		Student student = new Student();
		student.setFirstName("John");
		student.setLastName("Doe");
		student.setEmail("john.doe@gmail.com");
		student.setDepartment("Computer Science");
		studentService.updateStudent(student,id);

		System.out.println(student.getFirstName());

=======
//		Student student = new Student();
//		student.setFirstName("qqq");
//		student.setLastName("sss");
//		student.setEmail("effdds");
//		student.setDepartment("sdadfa");
//		studentService.addStudent(student);


		System.out.println("student"+studentService.getStudents());
>>>>>>> develop
	}

}
