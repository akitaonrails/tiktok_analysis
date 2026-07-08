package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class NegativeTestSettings {
    public static final TypeAdapter ADAPTER;

    @C09CT("cpu_cycle")
    public long cpuCycle;

    @C09CT("cpu_load_rate")
    public long cpuLoadRate;

    static {
        NormalGson.singleton();
        ADAPTER = new NegativeTestSettings_OptTypeAdapter();
    }

    public NegativeTestSettings() {
        this(0L, 0L);
    }

    public NegativeTestSettings(long j, long j2) {
        this.cpuLoadRate = j;
        this.cpuCycle = j2;
    }
}
