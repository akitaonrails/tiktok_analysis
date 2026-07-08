package com.ss.android.ugc.aweme.miniapp.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class RessoPlayRecord {

    @C09CT("last_finished_time")
    public final long lastFinishedTime;

    @C09CT("lifetime_finished_count")
    public final int lifetimeFinishedCount;

    public RessoPlayRecord(int i, long j) {
        this.lifetimeFinishedCount = i;
        this.lastFinishedTime = j;
    }
}
