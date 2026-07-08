package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_drawer_tab_landing_custom")
public final class LiveDrawerTabLandingCustomSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDrawerTabLandingCustomSetting INSTANCE = new LiveDrawerTabLandingCustomSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_drawer_tab_landing_custom", DEFAULT);
    }
}
