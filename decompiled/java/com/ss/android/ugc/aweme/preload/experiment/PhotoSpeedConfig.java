package com.ss.android.ugc.aweme.preload.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class PhotoSpeedConfig {

    @C09CT("algo_version")
    public final String algoVersion;

    @C09CT("calculate_speed_strategy_name")
    public final String calculateSpeedStrategyName;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("expired_time")
    public final int expiredTime;

    @C09CT("generate_samples_strategy_name")
    public final String generateSamplesStrategyName;

    @C09CT("group_method")
    public final int groupMethod;

    @C09CT("ignore_below_size")
    public final int ignoreBelowSize;

    @C09CT("ignore_max_cost")
    public final int ignoreMaxCost;

    @C09CT("ignore_not_hit_cdn")
    public final boolean ignoreNotHitCdn;

    @C09CT("need_filter_samples")
    public final boolean needFilterSamples;

    @C09CT("sample_pool_size")
    public final int samplePoolSize;

    @C09CT("should_subtract_connect_time")
    public final boolean shouldSubtractConnectTime;

    @C09CT("tracker_sample")
    public final float trackerSample;

    public PhotoSpeedConfig() {
        this(false, 0.0f, 0, 0, false, 0, false, 0, 0, false, null, null, null);
    }

    public PhotoSpeedConfig(boolean z, float f, int i, int i2, boolean z2, int i3, boolean z3, int i4, int i5, boolean z4, String str, String str2, String str3) {
        this.enable = z;
        this.trackerSample = f;
        this.groupMethod = i;
        this.ignoreBelowSize = i2;
        this.ignoreNotHitCdn = z2;
        this.ignoreMaxCost = i3;
        this.shouldSubtractConnectTime = z3;
        this.expiredTime = i4;
        this.samplePoolSize = i5;
        this.needFilterSamples = z4;
        this.algoVersion = str;
        this.generateSamplesStrategyName = str2;
        this.calculateSpeedStrategyName = str3;
    }
}
