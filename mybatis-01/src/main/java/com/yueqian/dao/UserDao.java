package com.yueqian.dao;

import com.yueqian.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询所有用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //插入一行数据
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

    //万能的Map
    int addUser2(Map<String,Object> map);

    //模糊查询
    List<User> getUserLike(String value);
}
