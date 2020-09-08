import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;


public class test {

    static Logger logger = Logger.getLogger(test.class);

    @Test
    public void testgetUserList() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //执行sql语句
            //方法1  官方推荐
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }

            //方法二主键过时，我就不写了，看下就成

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭sqlSession
            sqlSession.close();
        }

    }

    @Test
    public void testgetUerById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            User userById = mapper.getUserById(1);
            System.out.println(userById);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    //增删改需要提交事务
    @Test
    public void testaddUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            int addUser = mapper.addUser(new User(3, "张三", "123456"));
            if (addUser > 0) {
                System.out.println("插入成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //提交事务
            sqlSession.commit();
            sqlSession.close();
        }
    }


    @Test
    public void testupdateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            int updateUser = mapper.updateUser(new User(3, "李四", "123123"));
            if (updateUser > 0) {
                System.out.println("修改成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //提交事务
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testdeleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            int deleteUser = mapper.deleteUser(3);
            if (deleteUser > 0) {
                System.out.println("删除成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //提交事务
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testlog4j(){
        logger.info("info:进入了testlog4j!!!");
        logger.debug("debug:进入了testlog4j!!!");
        logger.error("error:进入了testlog4j!!!");
    }

}
