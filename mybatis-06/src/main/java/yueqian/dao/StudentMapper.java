package yueqian.dao;

import org.apache.ibatis.annotations.Select;
import yueqian.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有的学生以及对应的老师
//    @Select("select * from student")
    List<Student> getStudent();

    List<Student> getStudent2();
}
