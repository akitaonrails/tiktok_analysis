package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_start_time_fix_tracking_enable")
public final class LiveMatchBattleStartTimeTrackingFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchBattleStartTimeTrackingFixSetting INSTANCE = new LiveMatchBattleStartTimeTrackingFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_start_time_fix_tracking_enable", DEFAULT);
    }
}
