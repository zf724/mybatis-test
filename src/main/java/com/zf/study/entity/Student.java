package com.zf.study.entity;

import lombok.Data;

@Data
public class Student {
        //定义属性，和student表中的字段对应
    private int id;            //id===>s_id
    private String name;    //name===>s_name
}
