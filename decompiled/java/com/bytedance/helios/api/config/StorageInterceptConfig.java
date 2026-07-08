package com.bytedance.helios.api.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class StorageInterceptConfig {

    @C09CT("downgrade")
    public List<Object> downgradeList;

    @C09CT("enable_exception_path")
    public boolean enableExceptionPath;

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("watch")
    public List<Object> watchList;

    public StorageInterceptConfig() {
        this(false, false, null, null);
    }

    public StorageInterceptConfig(boolean z, boolean z2, List<Object> list, List<Object> list2) {
        this.enabled = z;
        this.enableExceptionPath = z2;
        this.watchList = list;
        this.downgradeList = list2;
    }
}
