package com.ss.android.ugc.aweme.slash.component;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class SkeletonDismissTimeConfig {

    @C09CT("android")
    public final Integer androidMs;

    @C09CT("ios")
    public final Integer iosMs;

    public SkeletonDismissTimeConfig() {
        this(null, null);
    }

    public SkeletonDismissTimeConfig(Integer num, Integer num2) {
        this.androidMs = num;
        this.iosMs = num2;
    }
}
