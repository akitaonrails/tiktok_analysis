package com.ss.android.ugc.aweme.search.performance.memory;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMemoryData {

    @C09CT("interval")
    public long interval;

    @C09CT("is_open")
    public final boolean isOpen;

    @C09CT("threshold_config")
    public Map<String, Integer> thresholds;

    public SearchMemoryData() {
        this(false, 60000L, null);
    }

    public SearchMemoryData(boolean z, long j, Map<String, Integer> map) {
        this.isOpen = z;
        this.interval = j;
        this.thresholds = map;
    }
}
