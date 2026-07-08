package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class AppLogCacheConfig {
    public static final TypeAdapter ADAPTER = new AppLogCacheConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("white_list")
    public String[] whiteList = {"livesdk_live_duration", "livesdk_live_show", "livesdk_rec_live_play", "livesdk_live_window_duration_v2", "livesdk_watch_onemin", "livesdk_live_play", "livesdk_live_draw", "livesdk_exit_survey", "livesdk_watch_thirtysec", "livesdk_watch_tensec", "livesdk_live_draw"};

    @C09CT("max_count")
    public int maxCount = 20;

    @C09CT("max_interval")
    public int maxInterval = 250;
}
