package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public class PerformanceSetting {
    public static final TypeAdapter ADAPTER = new PerformanceSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("fps_duration")
    public long fpsDuration;

    @C09CT("min_monitor_interval")
    public long minMonitorInterval;

    @C09CT("monitor_delay")
    public long monitorDelay;

    @C09CT("resident_interval")
    public long residentInterval;
}
