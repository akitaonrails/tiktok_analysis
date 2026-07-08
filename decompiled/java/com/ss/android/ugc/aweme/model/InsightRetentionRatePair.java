package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes7.dex */
public final class InsightRetentionRatePair {

    @C09CT("timestamp")
    public final String timestamp;

    @C09CT("value")
    public final double value;

    public InsightRetentionRatePair() {
        this(0.0d, CardStruct.IStatusCode.DEFAULT);
    }

    public InsightRetentionRatePair(double d, String str) {
        this.value = d;
        this.timestamp = str;
    }
}
