package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_victory_lap_funny_effect_panel")
public final class LiveMatchVictoryLapFunnyEffectPanelSetting {
    public static final LiveMatchVictoryLapFunnyEffectPanelSetting INSTANCE = new LiveMatchVictoryLapFunnyEffectPanelSetting();
    public static final String DEFAULT = "countdown";

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("live_match_victory_lap_funny_effect_panel", str);
        return stringValue != null ? stringValue : str;
    }
}
