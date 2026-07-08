package com.ss.android.ugc.aweme.inbox.ab;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveEventAdjustPriorityFc {

    @C09CT("count")
    public final int count;

    @C09CT("display_limit")
    public final long displayLimit;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("extra_priority_map")
    public final Map<String, Integer> extraPriorityMap;

    public LiveEventAdjustPriorityFc() {
        this(true, 1, C2097608Jq.LJ(), 3L);
    }

    public LiveEventAdjustPriorityFc(boolean z, int i, Map<String, Integer> map, long j) {
        this.enable = z;
        this.count = i;
        this.extraPriorityMap = map;
        this.displayLimit = j;
    }
}
