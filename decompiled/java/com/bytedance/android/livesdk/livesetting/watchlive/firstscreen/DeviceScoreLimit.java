package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DeviceScoreLimit {
    public static final TypeAdapter ADAPTER;

    @C09CT("click_delay_time")
    public int clickDelayTime;

    @C09CT("draw_delay_time")
    public int drawDelayTime;

    @C09CT("score_high")
    public float scoreHigh;

    @C09CT("score_low")
    public float scoreLow;

    static {
        NormalGson.singleton();
        ADAPTER = new DeviceScoreLimit_OptTypeAdapter();
    }

    public DeviceScoreLimit() {
        this(-1.0f, -1.0f, 0, 200);
    }

    public DeviceScoreLimit(float f, float f2, int i, int i2) {
        this.scoreHigh = f;
        this.scoreLow = f2;
        this.clickDelayTime = i;
        this.drawDelayTime = i2;
    }
}
