package com.bytedance.android.livesdk.live.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class FilterInfoData {

    @C09CT("is_filtered")
    public boolean isFiltered;

    @C09CT("reason")
    public String reason;

    public FilterInfoData() {
        this(false, null);
    }

    public FilterInfoData(boolean z, String str) {
        this.isFiltered = z;
        this.reason = str;
    }
}
