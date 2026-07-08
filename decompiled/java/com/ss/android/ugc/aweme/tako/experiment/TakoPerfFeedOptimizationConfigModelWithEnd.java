package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoPerfFeedOptimizationConfigModelWithEnd {

    @C09CT("feed_icon_show_delay")
    public final long feedIconShowDelay;

    @C09CT("high_priority_delay")
    public final long highPriorityDelay;

    @C09CT("init_task_delay")
    public final long initTaskDelay;

    @C09CT("low_priority_delay")
    public final long lowPriorityDelay;

    @C09CT("sheet_loading_timeout")
    public final long sheetLoadingTimeout;

    public TakoPerfFeedOptimizationConfigModelWithEnd() {
        this(0L, 3000L, 0L, 12000L, 3000L);
    }

    public TakoPerfFeedOptimizationConfigModelWithEnd(long j, long j2, long j3, long j4, long j5) {
        this.feedIconShowDelay = j;
        this.initTaskDelay = j2;
        this.highPriorityDelay = j3;
        this.lowPriorityDelay = j4;
        this.sheetLoadingTimeout = j5;
    }
}
