package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class RivalSectionConfig {
    public static final TypeAdapter ADAPTER = new RivalSectionConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("cache_ttl")
    public long cacheTTL;

    @C09CT("cache_use_type")
    public Integer cacheUseType;

    @C09CT("extra")
    public RivalSectionExtraConfig extra;

    @C09CT("open_click_preload")
    public boolean openClickPreload;

    @C09CT("open_last_cache")
    public boolean openLastCache;

    @C09CT("open_preload")
    public boolean openPreload;

    @C09CT("preload_delay")
    public long preloadDelay;

    @C09CT("preload_interval")
    public long preloadIntervalConfig;

    @C09CT("preload_times")
    public int preloadTimesConfig;

    @C09CT("reload_when_newly_fetched")
    public boolean reloadWhenNewlyFetched;

    @C09CT("rival_section_value")
    public int rivalSectionValue;

    public RivalSectionConfig() {
        this(-1, false, false, false, 0L, -1L, null, 1, 0L, true, null);
    }

    public RivalSectionConfig(int i, boolean z, boolean z2, boolean z3, long j, long j2, Integer num, int i2, long j3, boolean z4, RivalSectionExtraConfig rivalSectionExtraConfig) {
        this.rivalSectionValue = i;
        this.openPreload = z;
        this.openClickPreload = z2;
        this.openLastCache = z3;
        this.preloadDelay = j;
        this.cacheTTL = j2;
        this.cacheUseType = num;
        this.preloadTimesConfig = i2;
        this.preloadIntervalConfig = j3;
        this.reloadWhenNewlyFetched = z4;
        this.extra = rivalSectionExtraConfig;
    }
}
