package com.wit.mytest.mapper;

import com.wit.mytest.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface StudentMapper {
    @Select("select * from student where id= #{id}")
    Student getStudentById(Integer id);

    @Select("select * from student")
    public List<Student> getStudentList();

    @Insert("insert into student(name) values (#{name})")
    public int add(Student student);

    @Update("update student set name=#{student.name}")
    public int update(@Param("id") Integer id,@Param("student") Student student);

    @Delete("delete from student where id =#{id}")
    public int delete(Integer id);
}
