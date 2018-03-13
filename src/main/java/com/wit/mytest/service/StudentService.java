package com.wit.mytest.service;

import com.wit.mytest.bean.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName
 */
@Component
public interface StudentService {
    Student getStudentById(Integer id);
    public List<Student> getStudentList();
    public int add(Student student);
    public int update(Integer id,Student student);
    public int delete(Integer id);
}
