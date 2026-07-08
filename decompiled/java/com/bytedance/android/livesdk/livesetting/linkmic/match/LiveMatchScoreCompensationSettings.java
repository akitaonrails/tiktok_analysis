package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_score_compensation_config")
public final class LiveMatchScoreCompensationSettings {
    public static final LiveMatchScoreCompensationSettings INSTANCE = new LiveMatchScoreCompensationSettings();
    public static final CompensationConfig DEFAULT = new CompensationConfig(true, 5);

    private final CompensationConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CompensationConfig compensationConfig = DEFAULT;
        CompensationConfig compensationConfig2 = (CompensationConfig) settingsManager.getValueSafely("live_match_score_compensation_config", compensationConfig);
        return compensationConfig2 != null ? compensationConfig2 : compensationConfig;
    }

    public final long getCompensationTimeSec() {
        return getConfig().compensateTimeSec;
    }

    public final boolean isCompensationEnable() {
        return getConfig().compensateEnable;
    }
}
