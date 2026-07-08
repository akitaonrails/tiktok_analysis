package com.ss.android.ugc.aweme.ml.feature.expriment;

/* JADX INFO: loaded from: classes24.dex */
public final class ForceUploadConfig {
    public final long internal;
    public final boolean open;
    public final float sample;

    public ForceUploadConfig() {
        this(false, 259200000L, 1.0f);
    }

    public ForceUploadConfig(boolean z, long j, float f) {
        this.open = z;
        this.internal = j;
        this.sample = f;
    }
}
