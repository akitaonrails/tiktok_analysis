package com.ss.android.ugc.asve.context;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class DropFrameParams implements Serializable {

    @C09CT("delay_time")
    public final long delayTime;

    @C09CT("is_set_params")
    public final boolean isSetParams;

    @C09CT("max_drop_count")
    public final long maxDropCount;

    public DropFrameParams() {
        this(false, 33333L, 16L);
    }

    public final boolean isSetParams() {
        return this.isSetParams;
    }

    public DropFrameParams(boolean z, long j, long j2) {
        this.isSetParams = z;
        this.delayTime = j;
        this.maxDropCount = j2;
    }
}
