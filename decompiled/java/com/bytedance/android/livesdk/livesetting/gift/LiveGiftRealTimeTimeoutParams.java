package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftRealTimeTimeoutParams {
    public static final TypeAdapter ADAPTER = new LiveGiftRealTimeTimeoutParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("block_realtime_updates_after_sending_sec")
    public long blockAfterSendSec;

    @C09CT("real_time_request_enabled")
    public boolean realTimeRequestEnabled;

    @C09CT("real_time_update_timeout_ms")
    public long realTimeUpdateTimeout;

    @C09CT("real_time_reason_block_days")
    public long reasonBlockDays;

    @C09CT("real_time_reason_max_show_counts")
    public long reasonMaxShowCounts;

    public LiveGiftRealTimeTimeoutParams() {
        this(false, 30L, 1000L, 3L, 60L);
    }

    public LiveGiftRealTimeTimeoutParams(boolean z, long j, long j2, long j3, long j4) {
        this.realTimeRequestEnabled = z;
        this.reasonMaxShowCounts = j;
        this.realTimeUpdateTimeout = j2;
        this.reasonBlockDays = j3;
        this.blockAfterSendSec = j4;
    }
}
