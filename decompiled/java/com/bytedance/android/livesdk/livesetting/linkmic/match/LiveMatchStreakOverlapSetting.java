package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_streak_overlap")
public final class LiveMatchStreakOverlapSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchStreakOverlapSetting INSTANCE = new LiveMatchStreakOverlapSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_streak_overlap", DEFAULT);
    }
}
