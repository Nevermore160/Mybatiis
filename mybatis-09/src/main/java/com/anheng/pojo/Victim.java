package com.anheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//受害者
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Victim {
    private String srcGeoAddress;  //来源地理详细地址
    private long eventCount;  //事件数量
    private String destGeoRegion;  //目的地区
    private String catgory;  //告警类型
    private String startTime;  //起始时间
    private String victimSecurityZone;  //受害者安全域
    private String subCategory;  //告警子类型
}
