package com.ss.android.ugc.aweme.story.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class StoryInboxFetchConfig {

    @C09CT("delay_sec_time")
    public final long delaySecTime;

    @C09CT("enable_advance")
    public final boolean enableAdvance;

    @C09CT("expire_sec_time")
    public final long expireSecTime;

    public StoryInboxFetchConfig() {
        this(false, 0L, 0L);
    }

    public StoryInboxFetchConfig(boolean z, long j, long j2) {
        this.enableAdvance = z;
        this.delaySecTime = j;
        this.expireSecTime = j2;
    }
}
