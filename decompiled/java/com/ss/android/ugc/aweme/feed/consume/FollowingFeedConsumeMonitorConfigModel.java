package com.ss.android.ugc.aweme.feed.consume;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class FollowingFeedConsumeMonitorConfigModel {

    @C09CT("days")
    public final int days;

    @C09CT("delay")
    public final long delay;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("top_levels")
    public final List<Integer> topLevels;

    public FollowingFeedConsumeMonitorConfigModel() {
        this(false, C1697810uHb.LJIIJJI(5, 10, 15, 20, 50), 10000L, 3);
    }

    public FollowingFeedConsumeMonitorConfigModel(boolean z, List<Integer> list, long j, int i) {
        this.enable = z;
        this.topLevels = list;
        this.delay = j;
        this.days = i;
    }
}
