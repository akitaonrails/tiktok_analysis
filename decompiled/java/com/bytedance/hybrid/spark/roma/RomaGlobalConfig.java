package com.bytedance.hybrid.spark.roma;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class RomaGlobalConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_aio_latest_check_v2")
    public final boolean enableAioLatestCheckV2;

    @C09CT("enable_freeze_config")
    public final boolean enableFreezeConfig;

    @C09CT("enable_match_short_link")
    public final boolean enableMatchShortLink;

    @C09CT("enable_platform_api_fallback")
    public final boolean enablePlatformApiFallback;

    @C09CT("enable_progressive_mode")
    public final boolean enableProgressiveMode;

    @C09CT("enable_roma_mapping_to_spark_platform")
    public final boolean enableRomaMappingToSparkPlatform;

    @C09CT("enable_scheme_match")
    public final boolean enableSchemeMatch;

    @C09CT("enable_with_params")
    public final boolean enableWithParams;

    @C09CT("fallback")
    public final String fallbackScheme;

    @C09CT("platform_api_block_interval_ms")
    public final long platformApiBlockIntervalMs;

    @C09CT("platform_api_block_ms")
    public final long platformApiBlockMs;

    @C09CT("platform_api_config_cache_time_ms")
    public final long platformApiConfigCacheTimeMs;

    public RomaGlobalConfig() {
        this(true, null, true, false, true, 2000L, 1000L, 10000L, true, true, true, true, false);
    }

    public RomaGlobalConfig(boolean z, String str, boolean z2, boolean z3, boolean z4, long j, long j2, long j3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.enable = z;
        this.fallbackScheme = str;
        this.enableSchemeMatch = z2;
        this.enableWithParams = z3;
        this.enablePlatformApiFallback = z4;
        this.platformApiBlockMs = j;
        this.platformApiBlockIntervalMs = j2;
        this.platformApiConfigCacheTimeMs = j3;
        this.enableMatchShortLink = z5;
        this.enableProgressiveMode = z6;
        this.enableFreezeConfig = z7;
        this.enableRomaMappingToSparkPlatform = z8;
        this.enableAioLatestCheckV2 = z9;
    }
}
