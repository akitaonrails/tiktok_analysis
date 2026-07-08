package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_drawer_disable_game_landing")
public final class LiveDrawerDisableGameLandingSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDrawerDisableGameLandingSetting INSTANCE = new LiveDrawerDisableGameLandingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_drawer_disable_game_landing", DEFAULT);
    }
}
