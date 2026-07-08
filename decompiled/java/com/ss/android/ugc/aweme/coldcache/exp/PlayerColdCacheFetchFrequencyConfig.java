package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PlayerColdCacheFetchFrequencyConfig {

    @C09CT("background_only_one")
    public final boolean backgroundOnlyOne;

    @C09CT("background_scatter")
    public final boolean backgroundScatter;

    @C09CT("foreground_scatter")
    public final boolean foregroundScatter;

    @C09CT("global_only_one")
    public final boolean globalOnlyOne;

    @C09CT("page_idle_Define_ms")
    public final long pageIdleDefineMs;

    @C09CT("page_idle_trigger_fetch")
    public final boolean pageIdleTriggerFetch;

    @C09CT("scatter_duration_ms")
    public final long scatterDurationMs;

    @C09CT("scatter_only_one_times")
    public final boolean scatterOnlyOneTimes;

    @C09CT("sub_scene_wifi_only")
    public final int subSceneWifiOnly;

    @C09CT("supplement_cache")
    public final boolean supplementCache;

    public PlayerColdCacheFetchFrequencyConfig() {
        this(false, false, false, false, -1, 0L, false, false, false, 60000L);
    }

    public PlayerColdCacheFetchFrequencyConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, long j, boolean z5, boolean z6, boolean z7, long j2) {
        this.backgroundOnlyOne = z;
        this.globalOnlyOne = z2;
        this.foregroundScatter = z3;
        this.backgroundScatter = z4;
        this.subSceneWifiOnly = i;
        this.scatterDurationMs = j;
        this.scatterOnlyOneTimes = z5;
        this.supplementCache = z6;
        this.pageIdleTriggerFetch = z7;
        this.pageIdleDefineMs = j2;
    }
}
