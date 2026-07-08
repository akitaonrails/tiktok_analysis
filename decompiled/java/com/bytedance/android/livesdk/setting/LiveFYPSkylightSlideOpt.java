package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_fyp_skylight_inner_feed")
public final class LiveFYPSkylightSlideOpt {
    public static final int DEFAULT = 0;
    public static final LiveFYPSkylightSlideOpt INSTANCE = new LiveFYPSkylightSlideOpt();
    public static final int V1 = 1;
    public static final int V2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fyp_skylight_inner_feed", DEFAULT);
    }
}
