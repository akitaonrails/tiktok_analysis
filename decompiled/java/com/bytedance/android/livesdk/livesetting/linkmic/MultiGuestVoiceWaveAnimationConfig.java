package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestVoiceWaveAnimationConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("frame_duration_ms")
    public int frameDurationMs;

    @C09CT("loop_count")
    public int loopCount;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestVoiceWaveAnimationConfig_OptTypeAdapter();
    }

    public MultiGuestVoiceWaveAnimationConfig() {
        this(2, 10);
    }

    public MultiGuestVoiceWaveAnimationConfig(int i, int i2) {
        this.loopCount = i;
        this.frameDurationMs = i2;
    }
}
