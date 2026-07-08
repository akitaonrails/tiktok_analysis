package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class SkylightRefreshConfig {
    public static final TypeAdapter ADAPTER = new SkylightRefreshConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_follow_auto_refresh")
    public boolean enableFollowAutoRefresh;

    @C09CT("enable_follow_manual_refresh")
    public boolean enableFollowManualRefresh;

    @C09CT("enable_toplive_auto_refresh")
    public boolean enableTopliveAutoRefresh;

    @C09CT("enable_toplive_manual_refresh")
    public boolean enableTopliveManualRefresh;

    @C09CT("follow_refresh_sampling_rate")
    public float followRefreshSamplingRate;

    @C09CT("interval_follow_auto_refresh")
    public long intervalFollowSecond;

    @C09CT("interval_toplive_auto_refresh")
    public long intervalTopliveSecond;
}
