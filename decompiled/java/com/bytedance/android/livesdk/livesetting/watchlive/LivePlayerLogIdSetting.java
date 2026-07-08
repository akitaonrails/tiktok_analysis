package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "Live_player_set_log_id")
public final class LivePlayerLogIdSetting {
    public static final LivePlayerLogIdSetting INSTANCE = new LivePlayerLogIdSetting();
    public static final LivePlayerLogIdConfigData DEFAULT = new LivePlayerLogIdConfigData(true);

    public final LivePlayerLogIdConfigData getValue() {
        return (LivePlayerLogIdConfigData) SettingsManager.INSTANCE.getValueSafely("Live_player_set_log_id", DEFAULT);
    }

    public final boolean allowPassLogId() {
        LivePlayerLogIdConfigData value = getValue();
        if (value != null) {
            return value.enablePassLogId;
        }
        return true;
    }

    public final LivePlayerLogIdConfigData getDEFAULT() {
        return DEFAULT;
    }
}
