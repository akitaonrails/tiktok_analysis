package com.ss.android.ugc.aweme.social.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class Config {

    @C09CT("total_duration")
    public final long duration;

    @C09CT("ratio")
    public final float ratio;

    public Config() {
        this(300L, 0.66f);
    }

    public Config(long j, float f) {
        this.duration = j;
        this.ratio = f;
    }
}
