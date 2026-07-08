package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes10.dex */
public final class ResumeFeedConfig {

    @C09CT("resume_enable")
    public final int enable;

    @C09CT("keep_time")
    public final long keepTime;

    @C09CT("resume_unconditionally")
    public final boolean resumeUnconditionally;

    public ResumeFeedConfig() {
        this(0, Mp4ScreenVideoLoadTimeout.CONTROL, false);
    }

    public ResumeFeedConfig(int i, long j, boolean z) {
        this.enable = i;
        this.keepTime = j;
        this.resumeUnconditionally = z;
    }
}
