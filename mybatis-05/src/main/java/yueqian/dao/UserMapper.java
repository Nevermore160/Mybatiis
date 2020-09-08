package yueqian.dao;


import org.apache.ibatis.annotations.*;
import yueqian.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();

    //如果方法存在多个参数，使用注解时一定要在参数前面加上@Param
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id/*, @Param("name") String name*/);

    @Insert("insert into user(id, name, pwd) values (#{id}, #{name}, #{pwd})")
    int addUser(User user);

    @Update("update user set name = #{name},pwd = #{pwd} where id = #{id}")
    int updateUser(User user);

    //注意@Param括号里的内容，相当于给id去一个别名
    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);
}
