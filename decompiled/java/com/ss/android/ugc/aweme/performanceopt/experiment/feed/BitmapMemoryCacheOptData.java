package com.ss.android.ugc.aweme.performanceopt.experiment.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class BitmapMemoryCacheOptData {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_opt_entry_size")
    public final int maxOptEntrySize;

    public BitmapMemoryCacheOptData() {
        this(false, 10485760);
    }

    public BitmapMemoryCacheOptData(boolean z, int i) {
        this.enable = z;
        this.maxOptEntrySize = i;
    }
}
