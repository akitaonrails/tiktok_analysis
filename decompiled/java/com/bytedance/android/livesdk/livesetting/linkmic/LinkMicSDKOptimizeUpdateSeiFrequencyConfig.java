package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class LinkMicSDKOptimizeUpdateSeiFrequencyConfig {
    public static final TypeAdapter ADAPTER = new LinkMicSDKOptimizeUpdateSeiFrequencyConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("interval")
    public float interval;

    @C09CT("type")
    public int type;

    public LinkMicSDKOptimizeUpdateSeiFrequencyConfig() {
        this(true, 0.15f, 2);
    }

    public LinkMicSDKOptimizeUpdateSeiFrequencyConfig(boolean z, float f, int i) {
        this.enable = z;
        this.interval = f;
        this.type = i;
    }
}
