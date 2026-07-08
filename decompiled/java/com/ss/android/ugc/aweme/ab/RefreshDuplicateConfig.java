package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class RefreshDuplicateConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("real_consume")
    public final boolean realConsume;

    @C09CT("record_count")
    public final int recordCount;

    public RefreshDuplicateConfig() {
        this(false, 0, true);
    }

    public RefreshDuplicateConfig(boolean z, int i, boolean z2) {
        this.enable = z;
        this.recordCount = i;
        this.realConsume = z2;
    }
}
