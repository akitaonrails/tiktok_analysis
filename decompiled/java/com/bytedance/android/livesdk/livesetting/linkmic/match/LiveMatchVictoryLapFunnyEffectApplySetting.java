package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_victory_lap_funny_effect_apply")
public final class LiveMatchVictoryLapFunnyEffectApplySetting {
    public static final String DEFAULT = "livestreaming";
    public static final LiveMatchVictoryLapFunnyEffectApplySetting INSTANCE = new LiveMatchVictoryLapFunnyEffectApplySetting();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_match_victory_lap_funny_effect_apply", DEFAULT);
        return stringValue == null ? "livestreaming" : stringValue;
    }
}
