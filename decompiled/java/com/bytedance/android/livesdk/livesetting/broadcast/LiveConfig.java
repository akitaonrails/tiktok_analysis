package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveConfig {
    public static final TypeAdapter ADAPTER = new LiveConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_normal_room")
    public boolean enableNormalRoom;

    @C09CT("max_accumulate_times")
    public int maxAccumulateTimes;

    @C09CT("stall_threshold")
    public int stallThreshold;

    @C09CT("window_percent")
    public int windowPercent;

    public LiveConfig() {
        this(false, 3, 4, 80);
    }

    public LiveConfig(boolean z, int i, int i2, int i3) {
        this.enableNormalRoom = z;
        this.maxAccumulateTimes = i;
        this.stallThreshold = i2;
        this.windowPercent = i3;
    }
}
