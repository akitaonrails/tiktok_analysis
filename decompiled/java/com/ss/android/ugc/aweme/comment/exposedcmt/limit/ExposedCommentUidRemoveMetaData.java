package com.ss.android.ugc.aweme.comment.exposedcmt.limit;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class ExposedCommentUidRemoveMetaData implements Serializable {
    public static final int $stable = 0;

    @C09CT("start_limit_time")
    public final long startLimitTime;

    @C09CT("total_limit_time")
    public final int totalLimitDays;

    @C09CT("uid")
    public final String uid;

    public ExposedCommentUidRemoveMetaData() {
        this("", System.currentTimeMillis(), 0);
    }

    public ExposedCommentUidRemoveMetaData(String str, long j, int i) {
        this.uid = str;
        this.startLimitTime = j;
        this.totalLimitDays = i;
    }
}
