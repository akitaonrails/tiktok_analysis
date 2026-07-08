package com.bytedance.android.livesdk.livesetting.goodybag;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("fans_club_goody_bag")
public final class GoodyBagFansClubSetting {
    public static final boolean DEFAULT = false;
    public static final GoodyBagFansClubSetting INSTANCE = new GoodyBagFansClubSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fans_club_goody_bag", DEFAULT);
    }
}
