package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLiveExitAnimationDeviceConfig {
    public static final TypeAdapter ADAPTER = new TopLiveExitAnimationDeviceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("score_low")
    public float scoreLow;

    public TopLiveExitAnimationDeviceConfig() {
        this(true, 0.0f);
    }

    public TopLiveExitAnimationDeviceConfig(boolean z, float f) {
        this.enable = z;
        this.scoreLow = f;
    }
}
