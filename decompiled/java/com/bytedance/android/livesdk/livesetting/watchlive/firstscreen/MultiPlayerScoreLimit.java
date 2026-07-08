package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiPlayerScoreLimit {
    public static final TypeAdapter ADAPTER;

    @C09CT("score_high")
    public float scoreHigh;

    @C09CT("score_low")
    public float scoreLow;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiPlayerScoreLimit_OptTypeAdapter();
    }

    public MultiPlayerScoreLimit() {
        this(-1.0f, -1.0f);
    }

    public MultiPlayerScoreLimit(float f, float f2) {
        this.scoreHigh = f;
        this.scoreLow = f2;
    }
}
