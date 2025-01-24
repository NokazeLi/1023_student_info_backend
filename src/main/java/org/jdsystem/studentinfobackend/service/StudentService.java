package org.jdsystem.studentinfobackend.service;

import lombok.RequiredArgsConstructor;
import org.jdsystem.studentinfobackend.exception.StudentAlreadyExistsException;
import org.jdsystem.studentinfobackend.exception.StudentNotFoundException;
import org.jdsystem.studentinfobackend.model.Student;
import org.jdsystem.studentinfobackend.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService{
    private final StudentRepository studentRepository;

    //添加学生接口的业务逻辑
    @Override
    public Student addStudent(Student student) {
        if (studentAlreadyExists(student.getEmail())){
            throw new StudentAlreadyExistsException(student.getEmail()+ " already exists");
        }
        return studentRepository.save(student);
    }
    //查询所有学生接口的业务逻辑
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Sorry, no student found with the Id :" +id));
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student updateStudent(Student student, Long id) {
        return studentRepository.findById(id).map(st -> {
            st.setFirstName(student.getFirstName());
            st.setLastName(student.getLastName());
            st.setEmail(student.getEmail());
            st.setDepartment(student.getDepartment());
            return studentRepository.save(st);
        }).orElseThrow(()-> new StudentNotFoundException("Sorry,this student could not be found."));
    }
    //根据ID删除学生记录的接口的业务逻辑
    @Override
    public void  deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Sorry.student not found");
        }
        studentRepository.deleteById(id);
    }

    private boolean studentAlreadyExists(String email) {
        return studentRepository.findByEmail(email).isPresent();
    }
}
