package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class PullStreamSyncConfig {

    @C09CT("avoid_cold_start")
    public final boolean avoidColdStart;

    @C09CT("delay")
    public final long delayTime;

    @C09CT("stream_keep_time")
    public final long streamKeepTime;

    @C09CT("sync")
    public final boolean sync;

    public PullStreamSyncConfig() {
        this(false, 0L, 0L, false);
    }

    public PullStreamSyncConfig(boolean z, long j, long j2, boolean z2) {
        this.sync = z;
        this.streamKeepTime = j;
        this.delayTime = j2;
        this.avoidColdStart = z2;
    }
}
