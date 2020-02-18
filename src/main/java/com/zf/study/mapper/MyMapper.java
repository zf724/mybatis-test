package com.zf.study.mapper;

import com.zf.study.entity.Classes;
import com.zf.study.entity.Student;
import com.zf.study.entity.Teacher;

import java.util.List;

public interface MyMapper {
    List<Classes> getClass(int id);
    List<Classes> getClass2(int id);
    List<Classes> getClass3(int id);
    List<Classes> getClass4(int id);
    List<Teacher> getTeacher(int id);
    List<Teacher> getTeacher2(int id);
    List<Student> getStudent(int id);
}
