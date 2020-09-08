import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import yueqian.dao.StudentMapper;
import yueqian.dao.TeacherMapper;
import yueqian.pojo.Student;
import yueqian.pojo.Teacher;
import yueqian.utils.MybatisUtils;

import java.util.List;

public class Mytest {
    @Test
    public void testgetTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void testgetStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testgetStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent2();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
