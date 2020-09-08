package com.anheng.dao;

import com.anheng.pojo.DistributionTrend;
import org.apache.ibatis.annotations.Insert;

public interface DistributionTrendMapper {
    //插入数据
    @Insert("insert into safetyReport.DistributionTrend values(#{threatSeverity}, #{eventCount}, #{startTime})")
    int addDistributionTrend(DistributionTrend dbt);
}
