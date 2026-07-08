package com.ss.android.ugc.aweme.shortvideo.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishPatienceConfig {

    @C09CT("heart_beat_gap")
    public final long heartBeatGap;

    @C09CT("heart_beat_timeout")
    public final int heartBeatTimeout;

    @C09CT("simulate_progress_duration")
    public final long simulateProgressDuration;

    public PublishPatienceConfig() {
        this(0L, 5000, 0L);
    }

    public PublishPatienceConfig(long j, int i, long j2) {
        this.heartBeatGap = j;
        this.heartBeatTimeout = i;
        this.simulateProgressDuration = j2;
    }
}
