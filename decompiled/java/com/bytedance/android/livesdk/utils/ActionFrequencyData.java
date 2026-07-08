package com.bytedance.android.livesdk.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class ActionFrequencyData {

    @C09CT("happened_count")
    public final long happenedCount;

    @C09CT("saved_time")
    public final String savedTime;

    public ActionFrequencyData(String str, long j) {
        this.savedTime = str;
        this.happenedCount = j;
    }
}
