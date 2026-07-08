package com.bytedance.vcloud.strategy;

import com.bytedance.vcloud.strategy.StrategyStartupGearInfo;

/* JADX INFO: loaded from: classes24.dex */
public interface ILiveStartupRetryListener {
    boolean onStartupRetryResultCallback(StrategyStartupGearInfo.GearResponse gearResponse);
}
