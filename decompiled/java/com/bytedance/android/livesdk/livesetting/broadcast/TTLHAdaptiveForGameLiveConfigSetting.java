package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlh_adaptive_for_game_live_config")
public final class TTLHAdaptiveForGameLiveConfigSetting {
    public static final String DEFAULT = "";
    public static final TTLHAdaptiveForGameLiveConfigSetting INSTANCE = new TTLHAdaptiveForGameLiveConfigSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlh_adaptive_for_game_live_config", DEFAULT);
    }
}
