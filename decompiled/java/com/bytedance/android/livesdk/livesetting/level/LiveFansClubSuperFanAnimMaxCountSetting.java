package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_super_fan_anim_max_count")
public final class LiveFansClubSuperFanAnimMaxCountSetting {
    public static final int DEFAULT = 5;
    public static final LiveFansClubSuperFanAnimMaxCountSetting INSTANCE = new LiveFansClubSuperFanAnimMaxCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fans_club_super_fan_anim_max_count", DEFAULT);
    }
}
