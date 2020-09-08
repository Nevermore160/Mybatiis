import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import yueqian.dao.TeacherMapper;
import yueqian.pojo.Teacher;
import yueqian.utils.MybatisUtils;

import java.util.List;

public class Mytest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void tes2t(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
