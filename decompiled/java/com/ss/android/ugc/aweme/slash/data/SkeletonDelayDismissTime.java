package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SkeletonDelayDismissTime implements Serializable {

    @C09CT("android")
    public final Integer androidTimeMs;

    @C09CT("ios")
    public final Integer iosTimeMs;

    public SkeletonDelayDismissTime() {
        this(null, null);
    }

    public SkeletonDelayDismissTime(Integer num, Integer num2) {
        this.androidTimeMs = num;
        this.iosTimeMs = num2;
    }
}
