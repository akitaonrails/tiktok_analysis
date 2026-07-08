package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_drawer_game_landing_fix")
public final class LiveDrawerGameLandingFixSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDrawerGameLandingFixSetting INSTANCE = new LiveDrawerGameLandingFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_drawer_game_landing_fix", DEFAULT);
    }
}
