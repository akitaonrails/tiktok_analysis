package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class NoiseSuppressionConfig {
    public static final TypeAdapter ADAPTER = new NoiseSuppressionConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("start_delay_duration")
    public int startDelayDuration = 120;

    @C09CT("detect_duration")
    public int detectDuration = 30;

    @C09CT("detect_interval")
    public int detectInterval = 600;
}
