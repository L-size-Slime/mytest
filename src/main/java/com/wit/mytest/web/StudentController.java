package com.wit.mytest.web;

import com.wit.mytest.bean.JsonResult;
import com.wit.mytest.bean.Student;
import com.wit.mytest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value="student/{id}",method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getStudentById (@PathVariable(value = "id") Integer id){
        JsonResult r = new JsonResult();
        Student student =studentService.getStudentById(id);
        r.setResult(student);
        r.setStatus("ok");
        return ResponseEntity.ok(r);
    }
}
