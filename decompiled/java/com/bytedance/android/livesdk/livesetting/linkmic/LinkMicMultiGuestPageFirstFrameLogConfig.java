package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class LinkMicMultiGuestPageFirstFrameLogConfig {
    public static final TypeAdapter ADAPTER = new LinkMicMultiGuestPageFirstFrameLogConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("sample_rate")
    public double sampleRate;

    public LinkMicMultiGuestPageFirstFrameLogConfig() {
        this(false, 1.0d);
    }

    public LinkMicMultiGuestPageFirstFrameLogConfig(boolean z, double d) {
        this.enable = z;
        this.sampleRate = d;
    }
}
