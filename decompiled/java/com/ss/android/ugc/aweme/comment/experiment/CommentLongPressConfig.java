package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLongPressConfig {

    @C09CT("enable")
    public final int enable;

    @C09CT("max_contact_count")
    public final int maxContactCount;

    @C09CT("time")
    public final long time;

    public CommentLongPressConfig() {
        this(0, 500L, 15);
    }

    public CommentLongPressConfig(int i, long j, int i2) {
        this.enable = i;
        this.time = j;
        this.maxContactCount = i2;
    }
}
