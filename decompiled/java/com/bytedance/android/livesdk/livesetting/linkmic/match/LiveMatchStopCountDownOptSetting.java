package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_non_stop_count_down_opt")
public final class LiveMatchStopCountDownOptSetting {
    public static final LiveMatchStopCountDownOptSetting INSTANCE = new LiveMatchStopCountDownOptSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_non_stop_count_down_opt", DEFAULT);
    }
}
