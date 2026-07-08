package com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class RepostGuideShowRecordsModel {

    @C09CT("show_ts")
    public long guidanceShowTimestamp;

    @C09CT("interact_ts")
    public long interactTimestamp;

    @C09CT("room_id")
    public long roomId;

    public RepostGuideShowRecordsModel() {
        this(0L, 0L, 0L);
    }

    public RepostGuideShowRecordsModel(long j, long j2, long j3) {
        this.roomId = j;
        this.guidanceShowTimestamp = j2;
        this.interactTimestamp = j3;
    }
}
