package com.anheng.utils;

import com.alibaba.fastjson.JSONObject;
import com.anheng.pojo.DistributionTrend;
import org.apache.ibatis.session.SqlSession;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {


    public static final void readF1(String filePath) throws IOException {
        DistributionTrend dbt = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath)),20*1024*1024);
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            dbt = JSONObject.parseObject(line, DistributionTrend.class);
            SqlSession sqlSession = MybatisUtils.getSqlSession();
            DistributionTrend mapper = sqlSession.getMapper(DistributionTrend.class);

            sqlSession.close();
        }
        br.close();
    }


    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        readF1("C:\\Users\\Nevermore\\Desktop\\securityevent.log\\securityevent.log");
        long end = System.currentTimeMillis();
        System.out.println(end - l);
    }
}
