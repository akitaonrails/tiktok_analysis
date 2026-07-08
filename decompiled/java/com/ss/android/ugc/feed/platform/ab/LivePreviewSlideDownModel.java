package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class LivePreviewSlideDownModel {

    @C09CT("angle")
    public final int angle;

    @C09CT("enable_type")
    public final int enableType;

    public LivePreviewSlideDownModel() {
        this(-1, -1);
    }

    public LivePreviewSlideDownModel(int i, int i2) {
        this.enableType = i;
        this.angle = i2;
    }
}
