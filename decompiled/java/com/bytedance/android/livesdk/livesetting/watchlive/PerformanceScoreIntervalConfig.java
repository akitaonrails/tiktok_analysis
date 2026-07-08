package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PerformanceScoreIntervalConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("delay_time_ms")
    public int delayTimeMs;

    @C09CT("max_score")
    public float maxScore;

    @C09CT("min_score")
    public float minScore;

    static {
        NormalGson.singleton();
        ADAPTER = new PerformanceScoreIntervalConfig_OptTypeAdapter();
    }

    public PerformanceScoreIntervalConfig() {
        this(0.0f, Float.MAX_VALUE, 0);
    }

    public final int getDelayTimeMs() {
        return this.delayTimeMs;
    }

    public final float getMaxScore() {
        return this.maxScore;
    }

    public final float getMinScore() {
        return this.minScore;
    }

    public final void setDelayTimeMs(int i) {
        this.delayTimeMs = i;
    }

    public final void setMaxScore(float f) {
        this.maxScore = f;
    }

    public final void setMinScore(float f) {
        this.minScore = f;
    }

    public PerformanceScoreIntervalConfig(float f, float f2, int i) {
        this.minScore = f;
        this.maxScore = f2;
        this.delayTimeMs = i;
    }
}
