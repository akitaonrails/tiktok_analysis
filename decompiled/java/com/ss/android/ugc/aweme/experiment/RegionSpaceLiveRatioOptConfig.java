package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class RegionSpaceLiveRatioOptConfig {

    @C09CT("dynamic_adjust")
    public boolean dynamicAdjust;

    @C09CT("min_interval")
    public long minInterval;

    @C09CT("ratio")
    public int ratio;

    @C09CT("ratio_map")
    public Map<Float, Integer> ratioMap;

    public RegionSpaceLiveRatioOptConfig() {
        this(0, false, 0L, null);
    }

    public final void setDynamicAdjust(boolean z) {
        this.dynamicAdjust = z;
    }

    public final void setMinInterval(long j) {
        this.minInterval = j;
    }

    public final void setRatio(int i) {
        this.ratio = i;
    }

    public final void setRatioMap(Map<Float, Integer> map) {
        this.ratioMap = map;
    }

    public RegionSpaceLiveRatioOptConfig(int i, boolean z, long j, Map<Float, Integer> map) {
        this.ratio = i;
        this.dynamicAdjust = z;
        this.minInterval = j;
        this.ratioMap = map;
    }
}
