package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEasyExitCardDepthConfig {
    public static final TypeAdapter ADAPTER = new LiveEasyExitCardDepthConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("watch_duration_n")
    public int watchDurationN;

    @C09CT("watch_duration_single")
    public int watchDurationSingle;

    @C09CT("watch_n_count")
    public int watchNCount;

    public LiveEasyExitCardDepthConfig() {
        this(false, 0, 0, 0);
    }

    public LiveEasyExitCardDepthConfig(boolean z, int i, int i2, int i3) {
        this.enable = z;
        this.watchDurationSingle = i;
        this.watchDurationN = i2;
        this.watchNCount = i3;
    }
}
