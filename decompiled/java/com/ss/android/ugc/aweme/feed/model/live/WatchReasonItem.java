package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class WatchReasonItem implements Serializable {

    @C09CT("content")
    public Text content;

    @C09CT("reason_id")
    public long reasonId;

    public WatchReasonItem() {
        this(0L, null);
    }

    public WatchReasonItem(long j, Text text) {
        this.reasonId = j;
        this.content = text;
    }
}
