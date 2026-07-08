package com.ss.android.ugc.asve.editor;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class NLEDropFrameParams implements Serializable {

    @C09CT("delay_time")
    public final long delayTime;

    @C09CT("is_set_params")
    public final boolean isSetParams;

    @C09CT("max_drop_count")
    public final int maxDropCount;

    public NLEDropFrameParams() {
        this(false, 33333L, 2);
    }

    public final boolean isSetParams() {
        return this.isSetParams;
    }

    public NLEDropFrameParams(boolean z, long j, int i) {
        this.isSetParams = z;
        this.delayTime = j;
        this.maxDropCount = i;
    }
}
