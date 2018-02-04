package com.mutou.springboot.service;

import com.mutou.springboot.dao.StudentDao;
import com.mutou.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * ,__,
 * (oo)_____
 * (__)     )\
 * ````||---|| *
 * com.mutou.springboot.service <br>
 *
 * @author mutou <br>
 * @version 1.0.0
 * @date 04/02/2018 <br>
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public String updateStudent(Student student) {
        int res = studentDao.updateStudent(student);
        return res == 1 ? "success" : "fail";
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public int removeStudentById(int id) {
        return studentDao.removeStudentById(id);
    }
}
