package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "Live_player_set_session_id")
public final class LivePlayerSessionIdSetting {
    public static final LivePlayerSessionIdSetting INSTANCE = new LivePlayerSessionIdSetting();
    public static final LivePlayerSessionIdConfigData DEFAULT = new LivePlayerSessionIdConfigData(true, true);

    public final LivePlayerSessionIdConfigData getValue() {
        return (LivePlayerSessionIdConfigData) SettingsManager.INSTANCE.getValueSafely("Live_player_set_session_id", DEFAULT);
    }

    public final boolean allowCompactLogicOfSessionId() {
        LivePlayerSessionIdConfigData value = getValue();
        if (value != null) {
            return value.enableCompactLogicOfSessionId;
        }
        return true;
    }

    public final boolean allowPassSessionId() {
        LivePlayerSessionIdConfigData value = getValue();
        if (value != null) {
            return value.enablePassSessionId;
        }
        return true;
    }

    public final LivePlayerSessionIdConfigData getDEFAULT() {
        return DEFAULT;
    }
}
