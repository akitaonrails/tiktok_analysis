package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class VibeStatDelta {

    @C09CT("delta")
    public final Long delta;

    @C09CT("stats_type")
    public final Integer statsType;

    public VibeStatDelta() {
        this(0, 0L);
    }

    public VibeStatDelta(Integer num, Long l) {
        this.statsType = num;
        this.delta = l;
    }
}
