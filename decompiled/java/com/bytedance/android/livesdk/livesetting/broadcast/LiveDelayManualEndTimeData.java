package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveDelayManualEndTimeData {
    public static final TypeAdapter ADAPTER = new LiveDelayManualEndTimeData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("block_time")
    public long blockTime;

    @C09CT("delay_time")
    public long delayTime;

    @C09CT("enable")
    public boolean enable;

    public LiveDelayManualEndTimeData() {
        this(false, 3000L, 1000L);
    }

    public LiveDelayManualEndTimeData(boolean z, long j, long j2) {
        this.enable = z;
        this.blockTime = j;
        this.delayTime = j2;
    }
}
