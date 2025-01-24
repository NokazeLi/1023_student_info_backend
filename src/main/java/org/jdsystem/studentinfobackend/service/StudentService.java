package org.jdsystem.studentinfobackend.service;

import lombok.RequiredArgsConstructor;
import org.jdsystem.studentinfobackend.exception.StudentNotFoundException;
import org.jdsystem.studentinfobackend.model.Student;
import org.jdsystem.studentinfobackend.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {
    private final StudentRepository studentRepository;

//    @Override
    public Student updateStudent(Student student, Long id) {
        return studentRepository.findById(id).map(st -> {
            st.setFirstName(student.getFirstName());
            st.setLastName(student.getLastName());
            st.setEmail(student.getEmail());
            st.setDepartment(student.getDepartment());
            return studentRepository.save(st);
        }).orElseThrow(()-> new StudentNotFoundException("Sorry,this student could not be found."));
    }
}
