package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class FestRoundConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("event_end_time_ms")
    public long endTime;

    @C09CT("round_key")
    public String key;

    @C09CT("resource_id")
    public String resourceID;

    @C09CT("event_start_time_ms")
    public long startTime;

    static {
        NormalGson.singleton();
        ADAPTER = new FestRoundConfig_OptTypeAdapter();
    }

    public FestRoundConfig() {
        this("", 0L, 0L, "");
    }

    public FestRoundConfig(String str, long j, long j2, String str2) {
        this.key = str;
        this.startTime = j;
        this.endTime = j2;
        this.resourceID = str2;
    }
}
