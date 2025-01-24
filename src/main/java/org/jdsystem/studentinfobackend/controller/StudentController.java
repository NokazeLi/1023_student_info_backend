package org.jdsystem.studentinfobackend.controller;

import lombok.RequiredArgsConstructor;
import org.jdsystem.studentinfobackend.model.Student;
import org.jdsystem.studentinfobackend.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    //修改信息接口
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(student,id);
    }
}

