package com.anheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//时序分布趋势实体类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistributionTrend {
    private String threatSeverity;  //安全告警等级
    private String eventCount; //事件数量
    private String startTime; //开始时间
}
