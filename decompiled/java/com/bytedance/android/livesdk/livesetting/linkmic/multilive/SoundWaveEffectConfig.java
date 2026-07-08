package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class SoundWaveEffectConfig {
    public static final TypeAdapter ADAPTER = new SoundWaveEffectConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("fps")
    public int fps;

    @C09CT("high_duration")
    public long highDuration;

    @C09CT("low_duration")
    public long lowDuration;

    @C09CT("mid_duration")
    public long midDuration;

    public SoundWaveEffectConfig() {
        this(false, 30, 400L, 600L, 900L);
    }

    public SoundWaveEffectConfig(boolean z, int i, long j, long j2, long j3) {
        this.enable = z;
        this.fps = i;
        this.lowDuration = j;
        this.midDuration = j2;
        this.highDuration = j3;
    }
}
