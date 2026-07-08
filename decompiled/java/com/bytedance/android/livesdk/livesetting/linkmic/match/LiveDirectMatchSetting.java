package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_quick_match_configuration")
public final class LiveDirectMatchSetting {
    public static final LiveDirectMatchSetting INSTANCE = new LiveDirectMatchSetting();
    public static final LiveDirectMatchData DEFAULT = new LiveDirectMatchData(1, 20, 15, 0);

    public final LiveDirectMatchData getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveDirectMatchData liveDirectMatchData = DEFAULT;
        LiveDirectMatchData liveDirectMatchData2 = (LiveDirectMatchData) settingsManager.getValueSafely("live_quick_match_configuration", liveDirectMatchData);
        return liveDirectMatchData2 != null ? liveDirectMatchData2 : liveDirectMatchData;
    }

    public final boolean isEnabled() {
        return getValue().enabled == 1;
    }

    public final LiveDirectMatchData getDEFAULT() {
        return DEFAULT;
    }
}
