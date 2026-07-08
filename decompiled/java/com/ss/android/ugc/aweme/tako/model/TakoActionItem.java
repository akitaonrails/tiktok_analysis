package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoActionItem implements Serializable {
    public static final int $stable = 0;

    @C09CT("action_id")
    public final long actionId;

    @C09CT("action_sug")
    public final boolean actionSug;

    public TakoActionItem() {
        this(0L, true);
    }

    public TakoActionItem(long j, boolean z) {
        this.actionId = j;
        this.actionSug = z;
    }
}
