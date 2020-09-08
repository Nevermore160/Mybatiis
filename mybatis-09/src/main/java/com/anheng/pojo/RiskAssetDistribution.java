package com.anheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//风险资产分布
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskAssetDistribution {
    private String assetName;  //资产名称
    private String safeArea; //安全域
    private String riskRating;  //风险评级
    private String nextTime;  //最近异常发生时间
}
