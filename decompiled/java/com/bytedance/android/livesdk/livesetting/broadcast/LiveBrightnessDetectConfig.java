package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBrightnessDetectConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("dark_scene_toast_fluency")
    public int darkSceneToastFluency;

    @C09CT("detect_duration")
    public long detectDuration;

    @C09CT("detect_threshold")
    public long detectThreshold;

    @C09CT("detect_time")
    public int detectTime;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveBrightnessDetectConfig_OptTypeAdapter();
    }

    public LiveBrightnessDetectConfig() {
        this(0, 500L, 6, 33L);
    }

    public LiveBrightnessDetectConfig(int i, long j, int i2, long j2) {
        this.darkSceneToastFluency = i;
        this.detectDuration = j;
        this.detectTime = i2;
        this.detectThreshold = j2;
    }
}
