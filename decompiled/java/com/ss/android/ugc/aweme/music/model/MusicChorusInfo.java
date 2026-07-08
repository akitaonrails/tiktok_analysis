package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicChorusInfo implements Serializable {

    @C09CT("duration_ms")
    public long duration;

    @C09CT("start_ms")
    public long startTime;

    public final long getDuration() {
        return this.duration;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
