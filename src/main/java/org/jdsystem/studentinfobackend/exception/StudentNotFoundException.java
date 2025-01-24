
package org.jdsystem.studentinfobackend.exception;

public class StudentNotFoundException extends RuntimeException {
    //学生不存在异常
    public StudentNotFoundException(String message) {
        super(message);
    }
}

