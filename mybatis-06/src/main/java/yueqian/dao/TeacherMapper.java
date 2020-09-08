package yueqian.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import yueqian.pojo.Teacher;

public interface TeacherMapper {
    @Select("select * from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
