package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_team_gift_delay_unlock_im")
public final class TeamGiftDelayUnlockImSetting {
    public static final boolean DEFAULT = true;
    public static final TeamGiftDelayUnlockImSetting INSTANCE = new TeamGiftDelayUnlockImSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_team_gift_delay_unlock_im", DEFAULT);
    }
}
