package com.zf.study.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * classes
 * @author
 */
@Data
public class Teacher implements Serializable {
    //定义实体类的属性，与teacher表中的字段对应
    private int id;            //id===>t_id
    private String name;    //name===>t_name
}
