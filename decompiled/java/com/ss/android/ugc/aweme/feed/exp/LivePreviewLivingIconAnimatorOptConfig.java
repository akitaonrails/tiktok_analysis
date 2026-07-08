package com.ss.android.ugc.aweme.feed.exp;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePreviewLivingIconAnimatorOptConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("isEnable")
    public final boolean isEnable;

    @C09CT("isNewStyle")
    public final boolean isNewStyle;

    @C09CT("minFrameRate")
    public final int minFrameRate;

    @C09CT("refreshFrameInterval")
    public final int refreshFrameInterval;

    public LivePreviewLivingIconAnimatorOptConfig() {
        this(false, false, 1, 30);
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final boolean isNewStyle() {
        return this.isNewStyle;
    }

    public LivePreviewLivingIconAnimatorOptConfig(boolean z, boolean z2, int i, int i2) {
        this.isEnable = z;
        this.isNewStyle = z2;
        this.refreshFrameInterval = i;
        this.minFrameRate = i2;
    }
}
