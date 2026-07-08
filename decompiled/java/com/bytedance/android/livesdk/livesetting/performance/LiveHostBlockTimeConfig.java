package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveHostBlockTimeConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("block_time")
    public long blockTime;

    @C09CT("execute_time")
    public long executeTime;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveHostBlockTimeConfig_OptTypeAdapter();
    }

    public LiveHostBlockTimeConfig() {
        this(100L, 100L);
    }

    public LiveHostBlockTimeConfig(long j, long j2) {
        this.executeTime = j;
        this.blockTime = j2;
    }
}
