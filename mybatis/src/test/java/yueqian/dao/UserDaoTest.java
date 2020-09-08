package yueqian.dao;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import yueqian.pojo.User;
import yueqian.utils.MybatisUtils;


import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void testgetUerById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User userById = mapper.getUserById(1);
            System.out.println(userById);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testgetUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("start",0);
            map.put("end",2);
            List<User> userByLimit = mapper.getUserByLimit(map);
            for (User user : userByLimit) {
                System.out.println(user);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testgetUserByRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            RowBounds rowBounds = new RowBounds(0,2);
            //通过java代码层面实现分页
            List<Object> objects = sqlSession.selectList("yueqian.dao.UserMapper.getUserByRowBounds");
            for (Object object : objects) {
                System.out.println(object);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
