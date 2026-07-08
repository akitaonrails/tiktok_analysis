package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_card_check_alive_config")
public final class LiveCardCheckAliveConfigSetting {
    public static final LiveCardCheckAliveConfigSetting INSTANCE = new LiveCardCheckAliveConfigSetting();
    public static final CheckAliveConfig DEFAULT = new CheckAliveConfig(false, false, false, false);

    public final CheckAliveConfig getValue() {
        return (CheckAliveConfig) SettingsManager.INSTANCE.getValueSafely("live_card_check_alive_config", DEFAULT);
    }

    public final boolean matchAnyReverseConfig() {
        CheckAliveConfig value = getValue();
        if (value == null) {
            return false;
        }
        return value.disablePause || value.disableNr || value.disableNoStream || value.disableLiveEnd;
    }
}
