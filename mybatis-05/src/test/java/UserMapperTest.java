import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import yueqian.dao.UserMapper;
import yueqian.pojo.User;
import yueqian.utils.MybatisUtils;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testgetUerById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User userById = mapper.getUserById(2);
            System.out.println(userById);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testaddUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int user = mapper.addUser(new User(4, "张三", "123123"));
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testupdateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int user = mapper.updateUser(new User(4, "李四", "123456"));
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testdeleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int user = mapper.deleteUser(4);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
