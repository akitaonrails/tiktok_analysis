package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicTimeStruct {

    @C09CT("end_time_in_ms")
    public long endTime;

    @C09CT("start_time_in_ms")
    public long startTime;

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
