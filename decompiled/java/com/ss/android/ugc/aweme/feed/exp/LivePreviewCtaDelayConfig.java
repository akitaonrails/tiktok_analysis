package com.ss.android.ugc.aweme.feed.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePreviewCtaDelayConfig {

    @C09CT("active_day_feature")
    public String activeDayFeature;

    @C09CT("delay_time")
    public long delayTime;

    @C09CT("enable")
    public boolean enable;

    @C09CT("high_end_delay_time")
    public long highEndDelayTime;

    @C09CT("high_end_fallback_delay_time")
    public long highEndFallbackDelayTime;

    @C09CT("low_end_delay_time")
    public long lowEndDelayTime;

    @C09CT("low_end_fallback_delay_time")
    public long lowEndFallbackDelayTime;

    @C09CT("max_active_day")
    public int maxActiveDay;

    @C09CT("medium_end_delay_time")
    public long mediumEndDelayTime;

    @C09CT("medium_end_fallback_delay_time")
    public long mediumEndFallbackDelayTime;

    @C09CT("min_active_day")
    public int minActiveDay;

    @C09CT("show_time")
    public long showTime;

    @C09CT("strategy")
    public int strategy;

    @C09CT("style")
    public int style;

    @C09CT("use_active_day_feature")
    public boolean useActiveDayFeature;

    @C09CT("use_device_score")
    public boolean useDeviceScore;

    public LivePreviewCtaDelayConfig() {
        this(false, 0, 0, 3000L, 300L, false, "", 0, 0, false, 3000L, 3000L, 3000L, 3000L, 3000L, 3000L);
    }

    public LivePreviewCtaDelayConfig(boolean z, int i, int i2, long j, long j2, boolean z2, String str, int i3, int i4, boolean z3, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.enable = z;
        this.style = i;
        this.strategy = i2;
        this.delayTime = j;
        this.showTime = j2;
        this.useActiveDayFeature = z2;
        this.activeDayFeature = str;
        this.minActiveDay = i3;
        this.maxActiveDay = i4;
        this.useDeviceScore = z3;
        this.highEndDelayTime = j3;
        this.mediumEndDelayTime = j4;
        this.lowEndDelayTime = j5;
        this.highEndFallbackDelayTime = j6;
        this.mediumEndFallbackDelayTime = j7;
        this.lowEndFallbackDelayTime = j8;
    }
}
