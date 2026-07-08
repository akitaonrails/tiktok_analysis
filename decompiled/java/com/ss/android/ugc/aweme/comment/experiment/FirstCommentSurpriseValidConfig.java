package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class FirstCommentSurpriseValidConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("activity_id")
    public final long activityId;

    @C09CT("effect_id")
    public final int effectId;

    public FirstCommentSurpriseValidConfig() {
        this(0L, 1);
    }

    public FirstCommentSurpriseValidConfig(long j, int i) {
        this.activityId = j;
        this.effectId = i;
    }
}
