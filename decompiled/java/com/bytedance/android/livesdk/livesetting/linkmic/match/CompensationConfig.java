package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class CompensationConfig {
    public static final TypeAdapter ADAPTER = new CompensationConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean compensateEnable;

    @C09CT("time_interval")
    public long compensateTimeSec;

    public CompensationConfig() {
        this(true, 5L);
    }

    public CompensationConfig(boolean z, long j) {
        this.compensateEnable = z;
        this.compensateTimeSec = j;
    }
}
