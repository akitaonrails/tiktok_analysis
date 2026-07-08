package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveHeadAnimDowngradeConfig {

    @C09CT("downgradeFraction")
    public int downgradeFraction;

    @C09CT("downgrade_freq_ctr_time_interval_ms")
    public final long downgradeFreqCtrTimeIntervalMs;

    @C09CT("downgradeSourceConfigMap")
    public final Map<String, LiveHeadAnimDowngradeSourceConfig> downgradeSourceConfigMap;

    @C09CT("isEnable")
    public boolean isEnable;

    @C09CT("softDowngradeEnable")
    public final boolean softDowngradeEnable;

    public LiveHeadAnimDowngradeConfig() {
        this(false, 2, false, 40000L, new LinkedHashMap());
    }

    public LiveHeadAnimDowngradeConfig(boolean z, int i, boolean z2, long j, Map<String, LiveHeadAnimDowngradeSourceConfig> map) {
        this.isEnable = z;
        this.downgradeFraction = i;
        this.softDowngradeEnable = z2;
        this.downgradeFreqCtrTimeIntervalMs = j;
        this.downgradeSourceConfigMap = map;
    }
}
