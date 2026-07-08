package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LiveInfo implements Serializable {

    @C09CT("live_related_label")
    public LiveRelatedLabelInfo liveRelatedLabel;

    public LiveInfo() {
        this(null);
    }

    public LiveInfo(LiveRelatedLabelInfo liveRelatedLabelInfo) {
        this.liveRelatedLabel = liveRelatedLabelInfo;
    }
}
