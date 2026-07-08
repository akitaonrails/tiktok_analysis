package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class CommentButtonConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("long_press_time")
    public final long longPressTime;

    public CommentButtonConfig() {
        this(300L);
    }

    public CommentButtonConfig(long j) {
        this.longPressTime = j;
    }
}
