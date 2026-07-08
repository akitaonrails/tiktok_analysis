package com.ss.android.ugc.aweme.setting.performance;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class ToolsImageDiskStorageConfig {

    @C09CT("is_open")
    public final boolean isOpen;

    @C09CT("lru_cache_days")
    public final int lruCacheDays;

    public ToolsImageDiskStorageConfig() {
        this(false, 30);
    }

    public ToolsImageDiskStorageConfig(boolean z, int i) {
        this.isOpen = z;
        this.lruCacheDays = i;
    }
}
