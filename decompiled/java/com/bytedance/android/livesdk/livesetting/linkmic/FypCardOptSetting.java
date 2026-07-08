package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class FypCardOptSetting {
    public static final TypeAdapter ADAPTER = new FypCardOptSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("async_preload_opt")
    public boolean asyncPreloadOptEnable;

    @C09CT("cache_expire_time")
    public long cacheExpireTime;

    @C09CT("layout_opt")
    public boolean layoutOptEnable;

    @C09CT("low_performance_animate_opt")
    public boolean lowPerformanceAnimateOptEnable;

    @C09CT("low_performance_score")
    public float lowPerformanceScore;

    @C09CT("preload_opt")
    public boolean preloadOptEnable;

    @C09CT("pull_preload_opt")
    public boolean pullPreloadOptEnable;

    public FypCardOptSetting() {
        this(false, false, false, false, 300L, false, 6.0f);
    }

    public FypCardOptSetting(boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, float f) {
        this.layoutOptEnable = z;
        this.preloadOptEnable = z2;
        this.asyncPreloadOptEnable = z3;
        this.pullPreloadOptEnable = z4;
        this.cacheExpireTime = j;
        this.lowPerformanceAnimateOptEnable = z5;
        this.lowPerformanceScore = f;
    }
}
