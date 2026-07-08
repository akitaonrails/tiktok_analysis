package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentDoubleTapToLikeConfig {

    @C09CT("enable")
    public final int enable;

    @C09CT("expired_version")
    public final long expiredVersion;

    @C09CT("interval_time")
    public final long intervalTime;

    public CommentDoubleTapToLikeConfig() {
        this(0, 200L, -1L);
    }

    public CommentDoubleTapToLikeConfig(int i, long j, long j2) {
        this.enable = i;
        this.intervalTime = j;
        this.expiredVersion = j2;
    }
}
