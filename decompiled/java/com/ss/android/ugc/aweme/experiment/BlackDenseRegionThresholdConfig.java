package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class BlackDenseRegionThresholdConfig {

    @C09CT("dynamic_adjust")
    public boolean dynamicAdjust;

    @C09CT("min_interval")
    public long minInterval;

    @C09CT("threshold")
    public int threshold;

    @C09CT("threshold_map")
    public Map<Float, Integer> thresholdMap;

    public BlackDenseRegionThresholdConfig() {
        this(0, false, 0L, null);
    }

    public final void setDynamicAdjust(boolean z) {
        this.dynamicAdjust = z;
    }

    public final void setMinInterval(long j) {
        this.minInterval = j;
    }

    public final void setThreshold(int i) {
        this.threshold = i;
    }

    public final void setThresholdMap(Map<Float, Integer> map) {
        this.thresholdMap = map;
    }

    public BlackDenseRegionThresholdConfig(int i, boolean z, long j, Map<Float, Integer> map) {
        this.threshold = i;
        this.dynamicAdjust = z;
        this.minInterval = j;
        this.thresholdMap = map;
    }
}
