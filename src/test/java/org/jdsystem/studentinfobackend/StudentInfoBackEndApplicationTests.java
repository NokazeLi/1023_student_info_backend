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
		Student student = new Student();
		student.setFirstName("qqq");
		student.setLastName("sss");
		student.setEmail("effdds");
		student.setDepartment("sdadfa");
		studentService.addStudent(student);


		System.out.println("student"+studentService.getStudents());
	}

}
