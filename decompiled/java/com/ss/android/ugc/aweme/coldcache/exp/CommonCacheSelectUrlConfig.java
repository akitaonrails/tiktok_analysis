package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class CommonCacheSelectUrlConfig {

    @C09CT("b_cold_time_window_ms")
    public final int bColdTimeWindowMS;

    @C09CT("b_golden_time_window_ms")
    public final int bGoldenTimeWindowMS;

    @C09CT("c_preferred_bytevc2")
    public final boolean cPreferredBytevc2;

    @C09CT("cold_cache_time_step_ms")
    public final int coldCacheTimeStepMS;

    @C09CT("cold_fallback_index")
    public final int coldFallbackIndex;

    @C09CT("common_cache_default_speed")
    public final int commonCacheDefaultSpeed;

    @C09CT("enable_golden_select")
    public final boolean enableGoldenSelect;

    @C09CT("enable_refactor")
    public final boolean enableRefactor;

    @C09CT("enable_speed_calculate")
    public final boolean enableSpeedCalculate;

    @C09CT("f_cold_time_window_ms")
    public final int fColdTimeWindowMS;

    @C09CT("fallback_index")
    public final int fallbackIndex;

    @C09CT("high_quality_weight")
    public final float highQualityWeight;

    @C09CT("opt_calculator_speed")
    public final boolean optCalculatorSpeed;

    @C09CT("preferred_bytevc2")
    public final boolean preferredBytevc2;

    @C09CT("prevent_rate_inversion")
    public final boolean preventRateInversion;

    @C09CT("shortage_weight")
    public final float shortageWeight;

    public CommonCacheSelectUrlConfig() {
        this(false, false, false, false, false, 200, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, false, false);
    }

    public CommonCacheSelectUrlConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, float f2, boolean z6, boolean z7) {
        this.enableRefactor = z;
        this.enableGoldenSelect = z2;
        this.preferredBytevc2 = z3;
        this.cPreferredBytevc2 = z4;
        this.enableSpeedCalculate = z5;
        this.commonCacheDefaultSpeed = i;
        this.fColdTimeWindowMS = i2;
        this.bColdTimeWindowMS = i3;
        this.bGoldenTimeWindowMS = i4;
        this.coldCacheTimeStepMS = i5;
        this.fallbackIndex = i6;
        this.coldFallbackIndex = i7;
        this.shortageWeight = f;
        this.highQualityWeight = f2;
        this.preventRateInversion = z6;
        this.optCalculatorSpeed = z7;
    }
}
