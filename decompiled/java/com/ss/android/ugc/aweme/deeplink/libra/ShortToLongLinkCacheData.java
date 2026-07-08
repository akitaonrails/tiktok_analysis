package com.ss.android.ugc.aweme.deeplink.libra;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ShortToLongLinkCacheData {

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("max_record_size")
    public final int maxRecordSize;

    @C09CT("max_time_limit")
    public final long maxTimeLimit;

    public ShortToLongLinkCacheData() {
        this(false, 0L, 0);
    }

    public ShortToLongLinkCacheData(boolean z, long j, int i) {
        this.isEnable = z;
        this.maxTimeLimit = j;
        this.maxRecordSize = i;
    }
}
