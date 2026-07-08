package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_match_start_animation_win_streak_setting")
public final class LiveMatchStartAnimationWinStreakSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchStartAnimationWinStreakSetting INSTANCE = new LiveMatchStartAnimationWinStreakSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_start_animation_win_streak_setting", DEFAULT);
    }
}
