package com.ss.android.ugc.aweme.ml.feature.expriment;

/* JADX INFO: loaded from: classes14.dex */
public final class TTMFeatureMonitorConfig {
    public final float diskCacheMonitorRate;
    public final float memoryCacheMonitorRate;
    public final boolean open;
    public final float registerMonitorRate;

    public TTMFeatureMonitorConfig() {
        this(false, 1.0E-4f, 1.0E-4f, 1.0E-4f);
    }

    public TTMFeatureMonitorConfig(boolean z, float f, float f2, float f3) {
        this.open = z;
        this.registerMonitorRate = f;
        this.memoryCacheMonitorRate = f2;
        this.diskCacheMonitorRate = f3;
    }
}
