package com.ss.android.ugc.aweme.internalshare.impl.bootfinish;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InternalShareEvent {

    @C09CT("time_stamp")
    public final long timeStamp;

    @C09CT("trigger_type")
    public final int triggerType;

    @C09CT("user_id")
    public final long userId;

    public InternalShareEvent() {
        this(0L, 0, 0L);
    }

    public InternalShareEvent(long j, int i, long j2) {
        this.userId = j;
        this.triggerType = i;
        this.timeStamp = j2;
    }
}
