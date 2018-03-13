package com.wit.mytest.service.impl;

import com.wit.mytest.bean.Student;
import com.wit.mytest.mapper.StudentMapper;
import com.wit.mytest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }

    @Override
    public int add(Student student) {
        return studentMapper.add(student);
    }

    @Override
    public int update(Integer id, Student student) {
        return studentMapper.update(id, student);
    }

    @Override
    public int delete(Integer id) {
        return studentMapper.delete(id);
    }
}
