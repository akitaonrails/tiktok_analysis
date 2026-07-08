package com.ss.android.ugc.aweme.ml.feature.flash;

/* JADX INFO: loaded from: classes24.dex */
public final class FlashFeedPBMonitor {
    public final int nextTrigger;
    public final float sampleRate;

    public FlashFeedPBMonitor() {
        this(1.0f, 2);
    }

    public FlashFeedPBMonitor(float f, int i) {
        this.sampleRate = f;
        this.nextTrigger = i;
    }
}
