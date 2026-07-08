package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridMonitorLaunchExpData {

    @C09CT("data_storage_type")
    public int dataStorageType;

    @C09CT("executor_use_thread_pool")
    public boolean executorUseThreadPool;

    @C09CT("thread_pool_core_size")
    public int threadPoolCoreSize;

    @C09CT("thread_pool_max_size")
    public int threadPoolMaxSize;

    public HybridMonitorLaunchExpData() {
        this(0, false, 4, 8);
    }

    public HybridMonitorLaunchExpData(int i, boolean z, int i2, int i3) {
        this.dataStorageType = i;
        this.executorUseThreadPool = z;
        this.threadPoolCoreSize = i2;
        this.threadPoolMaxSize = i3;
    }
}
