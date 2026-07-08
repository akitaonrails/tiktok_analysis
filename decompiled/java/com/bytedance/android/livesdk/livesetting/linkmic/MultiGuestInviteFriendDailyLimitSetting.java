package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_invite_friend_daily_limit")
public final class MultiGuestInviteFriendDailyLimitSetting {
    public static final int DEFAULT = 100;
    public static final MultiGuestInviteFriendDailyLimitSetting INSTANCE = new MultiGuestInviteFriendDailyLimitSetting();

    public final int count() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_invite_friend_daily_limit", DEFAULT);
    }
}
