package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class RemoveGapData {

    @C09CT("android_clear_data")
    public final boolean clearData;

    @C09CT("live_min_gap_delete_count")
    public final int deleteCount;

    @C09CT("live_min_gap_delete_enable")
    public final boolean enable;

    public RemoveGapData() {
        this(false, 0, false);
    }

    public RemoveGapData(boolean z, int i, boolean z2) {
        this.enable = z;
        this.deleteCount = i;
        this.clearData = z2;
    }
}
