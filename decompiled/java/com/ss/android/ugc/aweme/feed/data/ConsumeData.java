package com.ss.android.ugc.aweme.feed.data;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class ConsumeData {

    @C09CT("client_acceptance_time")
    public long clientAcceptanceTime;

    @C09CT("filter_duplicate_time")
    public long filterDuplicateTime;

    @C09CT("live_card_leave_time")
    public long liveCardLeaveTime;

    @C09CT("live_card_show_time")
    public long liveCardShowTime;

    public ConsumeData() {
        this(0L, 0L, 0L, 0L);
    }

    public ConsumeData(long j, long j2, long j3, long j4) {
        this.filterDuplicateTime = j;
        this.clientAcceptanceTime = j2;
        this.liveCardShowTime = j3;
        this.liveCardLeaveTime = j4;
    }
}
