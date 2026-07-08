package com.bytedance.android.livesdk.livesetting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveActiveWatchGuideConfig {
    public static final TypeAdapter ADAPTER = new LiveActiveWatchGuideConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("guide_position")
    public String guidePosition;

    @C09CT("guide_style")
    public int guideStyle;

    @C09CT("skip_freq_control")
    public boolean skipFreqControl;

    public LiveActiveWatchGuideConfig() {
        this(false, "toplive", 1, false);
    }

    public LiveActiveWatchGuideConfig(boolean z, String str, int i, boolean z2) {
        this.enable = z;
        this.guidePosition = str;
        this.guideStyle = i;
        this.skipFreqControl = z2;
    }
}
