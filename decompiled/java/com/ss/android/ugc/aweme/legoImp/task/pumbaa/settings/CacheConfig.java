package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class CacheConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("size")
    public final int size;

    public CacheConfig() {
        this(false, 100);
    }

    public CacheConfig(boolean z, int i) {
        this.enable = z;
        this.size = i;
    }
}
