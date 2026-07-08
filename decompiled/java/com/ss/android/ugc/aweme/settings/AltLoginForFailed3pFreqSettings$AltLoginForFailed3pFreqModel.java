package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class AltLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel {

    @C09CT("interval")
    public final int interval;

    @C09CT("max_count")
    public final int maxCount;

    public AltLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel() {
        this(Integer.MAX_VALUE, 0);
    }

    public AltLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel(int i, int i2) {
        this.interval = i;
        this.maxCount = i2;
    }
}
