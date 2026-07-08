package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMUserPortraitDowngradeConfig {

    @C09CT("activity_status_performance_config")
    public final ActivityStatusPerformanceConfig activityStatusPerformanceConfig;

    @C09CT("min_pull_msg_interval")
    public final int minPullMsgInterval;

    @C09CT("min_pull_msg_success_interval")
    public final int minPullMsgSuccessInterval;

    public IMUserPortraitDowngradeConfig() {
        this(10000, 30000, new ActivityStatusPerformanceConfig(300000L, 300000L, 330000L, 3000L, 180000L, 300000L, 180000L, 3000L));
    }

    public IMUserPortraitDowngradeConfig(int i, int i2, ActivityStatusPerformanceConfig activityStatusPerformanceConfig) {
        this.minPullMsgInterval = i;
        this.minPullMsgSuccessInterval = i2;
        this.activityStatusPerformanceConfig = activityStatusPerformanceConfig;
    }
}
