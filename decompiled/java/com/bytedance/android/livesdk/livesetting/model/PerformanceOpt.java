package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PerformanceOpt {
    public static final TypeAdapter ADAPTER;

    @C09CT("live_audience_performance_collect_report_gap_time")
    public int audienceGapTime;

    @C09CT("live_host_performance_collect_report_gap_time")
    public int hostGapTime;

    static {
        NormalGson.singleton();
        ADAPTER = new PerformanceOpt_OptTypeAdapter();
    }
}
