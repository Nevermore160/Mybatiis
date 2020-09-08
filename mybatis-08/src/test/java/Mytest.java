import com.yueqian.dao.BlogMapper;
import com.yueqian.pojo.Blog;
import com.yueqian.utils.IDUtils;
import com.yueqian.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Mytest {
    @Test
    public void addInitBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getID());
        blog.setTitle("周淳逸");
        blog.setAuthor("盛慧康");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getID());
        blog.setTitle("周淳逸1");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getID());
        blog.setTitle("周淳逸2");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getID());
        blog.setTitle("周淳逸3");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void testqueryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","周淳逸1");
        map.put("author","盛慧康");
        List<Blog> blogs = mapper.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void testqueryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","周淳逸");
        map.put("author","盛慧康");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void testupdateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","周淳逸4");
        map.put("author","盛慧康");
        map.put("id","5d2e14bcefb7451490f8a60f3b14fc3d");
        mapper.updateBlog(map);

        sqlSession.close();
    }

    @Test
    public void testqueryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
