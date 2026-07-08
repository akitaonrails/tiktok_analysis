package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ScoreWeights {
    public static final TypeAdapter ADAPTER;

    @C09CT("fps_weight")
    public float fpsWeight = 10.0f;

    @C09CT("temp_weight")
    public float temperatureWeight = 10.0f;

    @C09CT("mem_weight")
    public float memoryWeight = 5.0f;

    @C09CT("cpu_weight")
    public float cpuWeight = 5.0f;

    @C09CT("net_weight")
    public float networkWeight = 5.0f;

    @C09CT("device_score_weight")
    public float deviceScoreWeight = 3.0f;

    static {
        NormalGson.singleton();
        ADAPTER = new ScoreWeights_OptTypeAdapter();
    }
}
