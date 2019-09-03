package com.cpp.learn;

import com.cpp.learn.dao.db1.StudentMapper;
import com.cpp.learn.dao.db2.TeacherMapper;
import com.cpp.learn.modal.Student;
import com.cpp.learn.modal.Teacher;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Transactional
    @GetMapping("/test")
    public Object testfail() {
        PageHelper.startPage(1, 2);
        PageInfo<Student> page = PageHelper.startPage(1, 2).doSelectPageInfo(() -> studentMapper.selectByExample(null));

//        List<Student> students = mapper.selectByExample(null);
        return page;


//        Student record = new Student();
//        record.setName("dgr");
//        record.setAge(24);
//        record.setProfile("a girl");
//        mapper.insert(record);
//        System.out.println("insert success");
//
//        StudentExample example = new StudentExample();
//        StudentExample.Criteria criteria = example.createCriteria();
//        criteria.andNameEqualTo("dgr");
//        List<Student> students = mapper.selectByExample(example);
//        System.out.println(students);
//        throw new RuntimeException("insert fail");
    }


    @GetMapping("/testdb1")
    public Object testdb1() {
        return studentMapper.selectByExample(null);
    }

    @GetMapping("/testdb2")
    public Object testdb2() {
        return teacherMapper.selectByExample(null);
    }

}
