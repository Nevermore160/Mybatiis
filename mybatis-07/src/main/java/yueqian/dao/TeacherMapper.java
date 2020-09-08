package yueqian.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import yueqian.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    //获取老师
//    @Select("select * from teacher")
//    List<Teacher> getTeacher();

    //获取指定老师下所有学生及老师的信息
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
