package com.zf.study.service;

import com.zf.study.entity.Classes;
import com.zf.study.entity.Student;
import com.zf.study.entity.Teacher;
import com.zf.study.mapper.MyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HelloService {
    @Resource
    private MyMapper myMapper;

    public void getClassById(Integer id){
        List<Classes> classesList = myMapper.getClass(id);
        List<Classes> classesList2 =myMapper.getClass2(id);
        List<Classes> classesList3 =myMapper.getClass3(id);
        List<Classes> classesList4 =myMapper.getClass4(id);

        //下面为断点作用，非测试代码
        List<Student> studentList =myMapper.getStudent(id);
    }
}
