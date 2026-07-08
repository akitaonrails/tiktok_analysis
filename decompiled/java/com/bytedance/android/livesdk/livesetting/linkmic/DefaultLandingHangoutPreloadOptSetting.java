package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "default_landing_hangout_preload_opt")
public final class DefaultLandingHangoutPreloadOptSetting {
    public static final int DEFAULT = 1;
    public static final DefaultLandingHangoutPreloadOptSetting INSTANCE = new DefaultLandingHangoutPreloadOptSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("default_landing_hangout_preload_opt", DEFAULT);
    }

    public final boolean isOpt() {
        return getValue() == 1;
    }
}
