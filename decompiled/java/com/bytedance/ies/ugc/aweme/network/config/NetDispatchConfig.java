package com.bytedance.ies.ugc.aweme.network.config;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class NetDispatchConfig {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("concurrent_limit_for_sync")
    public final int concurrentLimitForSync;

    @C09CT("dc_max_async_count")
    public final int dcMaxAsyncCount;

    @C09CT("dc_max_sync_count")
    public final int dcMaxSyncCount;

    @C09CT("download_thread_config")
    public final ThreadPoolConfig downloadThreadConfig;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_thread_config")
    public final boolean enableThreadConfig;

    @C09CT("enable_thread_config_for_sync")
    public final boolean enableThreadConfigForSync;

    @C09CT("immediate_api_thread_config")
    public final ThreadPoolConfig immediateApiThreadConfig;

    @C09CT("lower_api_thread_config")
    public final ThreadPoolConfig lowerApiThreadConfig;

    @C09CT("normal_api_thread_config")
    public final ThreadPoolConfig normalApiThreadConfig;

    @C09CT("thread_priority_config")
    public final int threadPriorityConfig;

    @C09CT("throttle_speed_4_domain")
    public final long throttleSpeed4Domain;

    public NetDispatchConfig() {
        this(false, true, true, 3, 0, new ThreadPoolConfig(1, Integer.MAX_VALUE, 10, -19), new ThreadPoolConfig(8, 8, 30, 0), new ThreadPoolConfig(1, 1, 10, 10), new ThreadPoolConfig(8, 8, 10, 10), 2, 5, 65536L);
    }

    public NetDispatchConfig(boolean z, boolean z2, boolean z3, int i, int i2, ThreadPoolConfig threadPoolConfig, ThreadPoolConfig threadPoolConfig2, ThreadPoolConfig threadPoolConfig3, ThreadPoolConfig threadPoolConfig4, int i3, int i4, long j) {
        this.enable = z;
        this.enableThreadConfig = z2;
        this.enableThreadConfigForSync = z3;
        this.threadPriorityConfig = i;
        this.concurrentLimitForSync = i2;
        this.immediateApiThreadConfig = threadPoolConfig;
        this.normalApiThreadConfig = threadPoolConfig2;
        this.lowerApiThreadConfig = threadPoolConfig3;
        this.downloadThreadConfig = threadPoolConfig4;
        this.dcMaxSyncCount = i3;
        this.dcMaxAsyncCount = i4;
        this.throttleSpeed4Domain = j;
    }
}
