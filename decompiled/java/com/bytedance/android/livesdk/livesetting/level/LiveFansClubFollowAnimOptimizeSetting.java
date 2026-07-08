package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_follow_anim_optimize")
public final class LiveFansClubFollowAnimOptimizeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubFollowAnimOptimizeSetting INSTANCE = new LiveFansClubFollowAnimOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_follow_anim_optimize", DEFAULT);
    }
}
