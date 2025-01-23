package org.jdsystem.studentinfobackend.sevice;

import lombok.RequiredArgsConstructor;
import org.jdsystem.studentinfobackend.model.Student;
import org.jdsystem.studentinfobackend.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService{
    private final StudentRepository studentRepository;

    @Override
    public void  deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Sorry.student not found");
        }
    }

}
