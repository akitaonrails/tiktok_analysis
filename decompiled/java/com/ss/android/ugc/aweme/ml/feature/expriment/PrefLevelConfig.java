package com.ss.android.ugc.aweme.ml.feature.expriment;

/* JADX INFO: loaded from: classes24.dex */
public final class PrefLevelConfig {
    public final float coefficient;
    public final float currentHighScore;
    public final float currentMiddleScore;
    public final float recentHighScore;
    public final float recentMiddleScore;
    public final float stableHighScore;
    public final float stableMiddleScore;

    public PrefLevelConfig() {
        this(53.7f, 64.0f, 55.2f, 65.52f, 54.56f, 64.8f, 0.5f);
    }

    public PrefLevelConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.stableMiddleScore = f;
        this.stableHighScore = f2;
        this.currentMiddleScore = f3;
        this.currentHighScore = f4;
        this.recentMiddleScore = f5;
        this.recentHighScore = f6;
        this.coefficient = f7;
    }
}
