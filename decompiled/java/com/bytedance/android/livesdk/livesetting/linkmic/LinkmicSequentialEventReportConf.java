package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkmicSequentialEventReportConf {
    public static final TypeAdapter ADAPTER = new LinkmicSequentialEventReportConf_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("loop_duration")
    public long loopDuration;

    @C09CT("mem_caches")
    public long memCaches;

    @C09CT("start_up_trigger_duration")
    public long startUpTriggerDuration;

    @C09CT("time_slice")
    public long timeSlice;

    public LinkmicSequentialEventReportConf() {
        this(false, 300000L, 2048L, 300000L, Long.MAX_VALUE, 0L);
    }

    public LinkmicSequentialEventReportConf(boolean z, long j, long j2, long j3, long j4, long j5) {
        this.enable = z;
        this.loopDuration = j;
        this.memCaches = j2;
        this.expireTime = j3;
        this.timeSlice = j4;
        this.startUpTriggerDuration = j5;
    }
}
