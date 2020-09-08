package com.anheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/16 11:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisposalSuggestions {
    private String subCategory;     //告警子类型
    private String suggestion;      //处置建议
    private String eventCount;        //事件数量
    private String startTime;         //起始时间
}
