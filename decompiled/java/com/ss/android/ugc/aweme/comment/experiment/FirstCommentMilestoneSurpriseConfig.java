package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class FirstCommentMilestoneSurpriseConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("consecutive_days_threshold")
    public final long consecutiveDaysThreshold;

    @C09CT("enable")
    public final int enable;

    @C09CT("first_comment_count_threshold")
    public final long firstCommentCountThreshold;

    public FirstCommentMilestoneSurpriseConfig() {
        this(0, 5L, 2L);
    }

    public FirstCommentMilestoneSurpriseConfig(int i, long j, long j2) {
        this.enable = i;
        this.firstCommentCountThreshold = j;
        this.consecutiveDaysThreshold = j2;
    }
}
