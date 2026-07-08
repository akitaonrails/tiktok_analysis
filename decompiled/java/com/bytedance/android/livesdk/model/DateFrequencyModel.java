package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class DateFrequencyModel {

    @C09CT("frequency")
    public int frequencyCount;

    @C09CT("timestamp")
    public long timestamp;

    public DateFrequencyModel() {
        this(0L, 0);
    }

    public DateFrequencyModel(long j, int i) {
        this.timestamp = j;
        this.frequencyCount = i;
    }
}
