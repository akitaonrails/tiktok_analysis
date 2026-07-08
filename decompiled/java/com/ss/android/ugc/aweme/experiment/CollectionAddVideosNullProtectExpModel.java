package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionAddVideosNullProtectExpModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fetch_num")
    public final Integer fetchNum;

    @C09CT("max_retry_times")
    public final int maxRetryTimes;

    public CollectionAddVideosNullProtectExpModel() {
        this(false, 0, null);
    }

    public CollectionAddVideosNullProtectExpModel(boolean z, int i, Integer num) {
        this.enable = z;
        this.maxRetryTimes = i;
        this.fetchNum = num;
    }
}
