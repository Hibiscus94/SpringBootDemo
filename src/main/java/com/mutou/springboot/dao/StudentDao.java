package com.mutou.springboot.dao;

import com.mutou.springboot.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * ,__,
 * (oo)_____
 * (__)     )\
 * ````||---|| *
 * com.mutou.springboot.dao <br>
 *
 * @author mutou <br>
 * @version 1.0.0
 * @date 04/02/2018 <br>
 */
@Repository
public class StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "mutou", "english"));
                put(2, new Student(2, "mutou2", "math"));
                put(3, new Student(3, "mutou3", "chinese"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }

    public int updateStudent(Student student){
        students.put(student.getId(),student);
        return 1;
    }

    public Student getStudentById(int id){
        return students.get(id);
    }

    public int removeStudentById(int id){
        students.remove(id);
        return 1;
    }
}
