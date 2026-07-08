package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AnimatedBtnStruct implements Serializable {

    @C09CT("appear_time")
    public Integer appearTime;

    @C09CT("continuous_show_count")
    public Integer continuousShowCount;

    @C09CT("interval_days")
    public Integer intervalDays;

    @C09CT("scenario")
    public Integer scenario;

    @C09CT("show_count_per_interval")
    public Integer showCountPerInterval;

    @C09CT("silence_days")
    public Integer silenceDays;

    public AnimatedBtnStruct() {
        this(Integer.valueOf(AnimatedBtnScenario.UNKNOWN.getValue()), null, null, null, null, null);
    }

    public AnimatedBtnStruct(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.scenario = num;
        this.appearTime = num2;
        this.continuousShowCount = num3;
        this.silenceDays = num4;
        this.showCountPerInterval = num5;
        this.intervalDays = num6;
    }
}
