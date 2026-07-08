package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchDropOffConfig {
    public static final TypeAdapter ADAPTER = new LiveMatchDropOffConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("battle_finish_disabled_for_others")
    public boolean battleFinishDisabledForOthers;

    @C09CT("enable")
    public boolean enable;

    @C09CT("toast_delay_time_ms")
    public long toastDelayMs;

    public LiveMatchDropOffConfig() {
        this(true, true, 1000L);
    }

    public LiveMatchDropOffConfig(boolean z, boolean z2, long j) {
        this.enable = z;
        this.battleFinishDisabledForOthers = z2;
        this.toastDelayMs = j;
    }
}
