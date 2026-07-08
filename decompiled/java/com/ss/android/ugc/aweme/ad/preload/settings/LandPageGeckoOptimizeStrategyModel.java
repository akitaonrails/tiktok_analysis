package com.ss.android.ugc.aweme.ad.preload.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class LandPageGeckoOptimizeStrategyModel {

    @C09CT("enable_device_status_control")
    public final boolean enableDeviceStatusControl;

    @C09CT("enable_pause_and_resume_task")
    public final boolean enablePauseAndResumeTask;

    @C09CT("traffic_monitor_interval")
    public final long trafficMonitorInterval;

    public LandPageGeckoOptimizeStrategyModel() {
        this(false, 10L, false);
    }

    public LandPageGeckoOptimizeStrategyModel(boolean z, long j, boolean z2) {
        this.enableDeviceStatusControl = z;
        this.trafficMonitorInterval = j;
        this.enablePauseAndResumeTask = z2;
    }
}
