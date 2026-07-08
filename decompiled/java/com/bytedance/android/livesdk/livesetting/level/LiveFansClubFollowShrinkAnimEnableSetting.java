package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_follow_shrink_anim_enable")
public final class LiveFansClubFollowShrinkAnimEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubFollowShrinkAnimEnableSetting INSTANCE = new LiveFansClubFollowShrinkAnimEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_follow_shrink_anim_enable", DEFAULT);
    }
}
