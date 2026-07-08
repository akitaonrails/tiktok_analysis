package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ConfigSettingsParams {
    public static final TypeAdapter ADAPTER = new ConfigSettingsParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_force_request_when_daily_gift_expired")
    public boolean enableForceReq;

    @C09CT("refresh_delay_time")
    public int refreshDelayTime;

    @C09CT("task_info_request_fail_retry_times")
    public int requestRetryTimes;

    @C09CT("seconds_to_start_request_next_day_task")
    public long timeCanRequestNextDay;

    public ConfigSettingsParams() {
        this(3600L, 3, 5, false);
    }

    public ConfigSettingsParams(long j, int i, int i2, boolean z) {
        this.timeCanRequestNextDay = j;
        this.requestRetryTimes = i;
        this.refreshDelayTime = i2;
        this.enableForceReq = z;
    }
}
