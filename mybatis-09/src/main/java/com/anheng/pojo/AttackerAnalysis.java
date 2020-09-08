package com.anheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/16 10:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttackerAnalysis {
    private String killChain;       //攻击链
    private String srcAddress;      //来源IP
    private String srcGeoCountry;   //来源国家
    private String srcGeoAddress;   //来源地理详细地址
    private String eventCount;        //事件数量
    private String category;        //告警类型
    private String startTime;       //起始时间
    private String threatSeverity;  //安全威胁等级
}
