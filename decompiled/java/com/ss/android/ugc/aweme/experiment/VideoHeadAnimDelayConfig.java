package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class VideoHeadAnimDelayConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("quickSlideJudgeThreshold")
    public final float quickSlideJudgeThreshold;

    public VideoHeadAnimDelayConfig() {
        this(false, 0.8f);
    }

    public VideoHeadAnimDelayConfig(boolean z, float f) {
        this.enable = z;
        this.quickSlideJudgeThreshold = f;
    }
}
