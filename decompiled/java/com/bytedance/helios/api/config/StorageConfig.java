package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class StorageConfig {

    @C09CT("include_callstack")
    public final boolean includeCallstack;

    @C09CT("monitor_rate")
    public final double monitorRate;

    @C09CT("nvwa_aggregate_size")
    public final int nvwaAggregateSize;

    @C09CT("report_type")
    public final int reportType;

    @C09CT("storage_policy")
    public final StorageInterceptConfig storageInterceptConfig;

    @C09CT("storage_lib_regex_whitelist")
    public final String[] storageLibRegexWhitelist;

    public StorageConfig() {
        this(1.0d, 1, 100, false, new StorageInterceptConfig(false, false, null, null), new String[0]);
    }

    public StorageConfig(double d, int i, int i2, boolean z, StorageInterceptConfig storageInterceptConfig, String[] strArr) {
        this.monitorRate = d;
        this.reportType = i;
        this.nvwaAggregateSize = i2;
        this.includeCallstack = z;
        this.storageInterceptConfig = storageInterceptConfig;
        this.storageLibRegexWhitelist = strArr;
    }
}
