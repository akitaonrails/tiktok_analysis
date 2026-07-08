package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class WidgetBatchLoadConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("count")
    public int count;

    @C09CT("delay_duration")
    public long delayDuration;

    @C09CT("enable_batch_load")
    public int enableLiveEndOpt;

    @C09CT("interval_duration")
    public long intervalDuration;

    static {
        NormalGson.singleton();
        ADAPTER = new WidgetBatchLoadConfig_OptTypeAdapter();
    }

    public WidgetBatchLoadConfig() {
        this(0, 500L, 1000L, 10);
    }

    public WidgetBatchLoadConfig(int i, long j, long j2, int i2) {
        this.enableLiveEndOpt = i;
        this.delayDuration = j;
        this.intervalDuration = j2;
        this.count = i2;
    }
}
