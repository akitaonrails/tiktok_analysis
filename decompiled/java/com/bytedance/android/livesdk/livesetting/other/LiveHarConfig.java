package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveHarConfig {
    public static final TypeAdapter ADAPTER = new LiveHarConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("manual_trigger_interval")
    public long minTriggerInterval;

    @C09CT("timer_trigger_enable")
    public boolean timerTriggerEnable;

    @C09CT("timer_trigger_interval")
    public long timerTriggerInterval;

    public LiveHarConfig() {
        this(false, false, 60000L, 15000L);
    }

    public LiveHarConfig(boolean z, boolean z2, long j, long j2) {
        this.enable = z;
        this.timerTriggerEnable = z2;
        this.timerTriggerInterval = j;
        this.minTriggerInterval = j2;
    }
}
