package yueqian.dao;


import yueqian.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //根据id查询用户
    User getUserById(int id);

    //分页查询
    List<User> getUserByLimit(Map<String,Object> map);

    //分页查询2
    List<User> getUserByRowBounds();
}
