package com.ss.android.ugc.aweme.config;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class PreloadVideoConfigAndroidScore {

    @C09CT("high_level")
    public final float highLevel;

    @C09CT("low_level")
    public final float lowLevel;

    public PreloadVideoConfigAndroidScore() {
        this(6.0f, 8.0f);
    }

    public PreloadVideoConfigAndroidScore(float f, float f2) {
        this.lowLevel = f;
        this.highLevel = f2;
    }
}
