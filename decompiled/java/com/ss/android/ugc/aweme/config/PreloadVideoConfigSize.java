package com.ss.android.ugc.aweme.config;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class PreloadVideoConfigSize {

    @C09CT("high_level")
    public final long highLevel;

    @C09CT("low_level")
    public final long lowLevel;

    @C09CT("mid_level")
    public final long midLevel;

    public PreloadVideoConfigSize() {
        this(102400L, 204800L, 307200L);
    }

    public PreloadVideoConfigSize(long j, long j2, long j3) {
        this.lowLevel = j;
        this.midLevel = j2;
        this.highLevel = j3;
    }
}
