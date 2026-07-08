package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ForestStrategy {

    @C09CT("deep_clean_threshold")
    public float deepCleanThreshold;

    @C09CT("default_page_size")
    public Integer defaultPageSize;

    @C09CT("disable_dynamic_component_io_optimize")
    public boolean disableDynamicComponentIOOptimize;

    @C09CT("enable_delete_h5_corrupted_resource")
    public boolean enableDeleteH5CorruptedResource;

    @C09CT("enable_delete_lynx_corrupted_resource")
    public boolean enableDeleteLynxCorruptedResource;

    @C09CT("enable_parallel_h5_loading")
    public boolean enableParallelLoadingInH5;

    @C09CT("expiration_survival_time")
    public long expirationSurvivalTime;

    @C09CT("force_meta")
    public int forceMeta;

    @C09CT("forest_buffer_strategy")
    public int forestBufferStrategy;

    @C09CT("ignore_all_params_if_gecko")
    public boolean ignoreAllParamsIfGecko;

    @C09CT("in_flight_count")
    public int inFlightCount;

    @C09CT("log_threshold")
    public float logThreshold;

    @C09CT("max_expiration_time")
    public Long maxExpirationTime;

    @C09CT("meta_threshold")
    public Integer metaThreshold;

    @C09CT("monitor_memory_threshold")
    public float monitorMemoryThreshold;

    @C09CT("optimize_cache_structure")
    public boolean optimizeCacheStructure;

    @C09CT("optimize_data_type")
    public boolean optimizeDataType;

    @C09CT("optimize_error_info_map")
    public boolean optimizeErrorInfoMap;

    @C09CT("optimize_prefix_parser")
    public boolean optimizePrefixParser;

    @C09CT("preconneect_when_prefetch")
    public boolean preConnectWhenPrefetch;

    public ForestStrategy() {
        this(0, null, false, false, false, 0, null, null, false, false, false, false, false, 0.0f, Long.MAX_VALUE, false, false, 20, 0.1f, 0.1f);
    }

    public ForestStrategy(int i, Long l, boolean z, boolean z2, boolean z3, int i2, Integer num, Integer num2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, float f, long j, boolean z9, boolean z10, int i3, float f2, float f3) {
        this.forestBufferStrategy = i;
        this.maxExpirationTime = l;
        this.enableDeleteH5CorruptedResource = z;
        this.enableDeleteLynxCorruptedResource = z2;
        this.disableDynamicComponentIOOptimize = z3;
        this.forceMeta = i2;
        this.metaThreshold = num;
        this.defaultPageSize = num2;
        this.enableParallelLoadingInH5 = z4;
        this.optimizePrefixParser = z5;
        this.optimizeErrorInfoMap = z6;
        this.optimizeDataType = z7;
        this.preConnectWhenPrefetch = z8;
        this.deepCleanThreshold = f;
        this.expirationSurvivalTime = j;
        this.optimizeCacheStructure = z9;
        this.ignoreAllParamsIfGecko = z10;
        this.inFlightCount = i3;
        this.logThreshold = f2;
        this.monitorMemoryThreshold = f3;
    }
}
