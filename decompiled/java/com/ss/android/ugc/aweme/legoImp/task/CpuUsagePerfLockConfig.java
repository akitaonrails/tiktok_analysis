package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class CpuUsagePerfLockConfig {
    public static final int $stable = 8;

    @C09CT("critical_level")
    public float criticalLevel;

    @C09CT("enable")
    public boolean enable;

    @C09CT("high_level")
    public float highLevel;

    @C09CT("interval")
    public long interval;

    @C09CT("medium_level")
    public float mediumLevel;

    @C09CT("perflock_time")
    public int perflockTime;

    @C09CT("threshold_level")
    public double thresholdLevel;

    public CpuUsagePerfLockConfig() {
        this(false, 0, 0L, 0.4d, 0.4f, 0.55f, 0.7f);
    }

    public final void setCriticalLevel(float f) {
        this.criticalLevel = f;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setHighLevel(float f) {
        this.highLevel = f;
    }

    public final void setInterval(long j) {
        this.interval = j;
    }

    public final void setMediumLevel(float f) {
        this.mediumLevel = f;
    }

    public final void setPerflockTime(int i) {
        this.perflockTime = i;
    }

    public final void setThresholdLevel(double d) {
        this.thresholdLevel = d;
    }

    public CpuUsagePerfLockConfig(boolean z, int i, long j, double d, float f, float f2, float f3) {
        this.enable = z;
        this.perflockTime = i;
        this.interval = j;
        this.thresholdLevel = d;
        this.mediumLevel = f;
        this.highLevel = f2;
        this.criticalLevel = f3;
    }
}
