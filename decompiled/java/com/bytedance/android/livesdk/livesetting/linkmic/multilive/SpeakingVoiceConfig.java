package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class SpeakingVoiceConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("voice_high_value")
    public int high;

    @C09CT("voice_low_value")
    public int low;

    static {
        NormalGson.singleton();
        ADAPTER = new SpeakingVoiceConfig_OptTypeAdapter();
    }

    public SpeakingVoiceConfig() {
        this(120, 180);
    }

    public final int getHigh() {
        return this.high;
    }

    public final int getLow() {
        return this.low;
    }

    public final void setHigh(int i) {
        this.high = i;
    }

    public final void setLow(int i) {
        this.low = i;
    }

    public SpeakingVoiceConfig(int i, int i2) {
        this.low = i;
        this.high = i2;
    }
}
