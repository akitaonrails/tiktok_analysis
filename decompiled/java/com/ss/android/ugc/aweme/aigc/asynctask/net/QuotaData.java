package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class QuotaData {

    @C09CT("total_count")
    public final int totalCount;

    @C09CT("used_count")
    public final int usedCount;

    @C09CT("user_remain_count")
    public final int userRemainCount;

    @C09CT("user_used_count")
    public final int userUsedCount;

    public QuotaData() {
        this(0, 0, 0, 0);
    }

    public QuotaData(int i, int i2, int i3, int i4) {
        this.totalCount = i;
        this.usedCount = i2;
        this.userRemainCount = i3;
        this.userUsedCount = i4;
    }
}
