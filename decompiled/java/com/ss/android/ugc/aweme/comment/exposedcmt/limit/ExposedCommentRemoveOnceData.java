package com.ss.android.ugc.aweme.comment.exposedcmt.limit;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class ExposedCommentRemoveOnceData implements Serializable {
    public static final int $stable = 0;

    @C09CT("start_limit_time")
    public final long startLimitTime;

    @C09CT("total_limit_time")
    public final int totalLimitDays;

    public ExposedCommentRemoveOnceData() {
        this(System.currentTimeMillis(), 0);
    }

    public ExposedCommentRemoveOnceData(long j, int i) {
        this.startLimitTime = j;
        this.totalLimitDays = i;
    }
}
