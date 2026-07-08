package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioChatWatermarkResolution {
    public static final TypeAdapter ADAPTER;

    @C09CT("h")
    public int h;

    @C09CT("w")
    public int w;

    static {
        NormalGson.singleton();
        ADAPTER = new AudioChatWatermarkResolution_OptTypeAdapter();
    }

    public AudioChatWatermarkResolution() {
        this(240, 240);
    }

    public AudioChatWatermarkResolution(int i, int i2) {
        this.w = i;
        this.h = i2;
    }
}
