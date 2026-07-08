package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class FeedActionData implements Serializable {

    @C09CT("show_time")
    public final long showTime;

    public FeedActionData() {
        this(0L);
    }

    public FeedActionData(long j) {
        this.showTime = j;
    }
}
