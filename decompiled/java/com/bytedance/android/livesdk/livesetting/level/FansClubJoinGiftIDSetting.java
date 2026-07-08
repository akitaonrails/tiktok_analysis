package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_join_gift_id")
public final class FansClubJoinGiftIDSetting {
    public static final long DEFAULT = 7934;
    public static final FansClubJoinGiftIDSetting INSTANCE = new FansClubJoinGiftIDSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_fans_club_join_gift_id", DEFAULT);
    }
}
