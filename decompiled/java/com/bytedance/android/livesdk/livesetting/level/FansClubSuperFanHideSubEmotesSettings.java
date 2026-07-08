package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_fans_club_super_fan_hide_sub_emotes")
public final class FansClubSuperFanHideSubEmotesSettings {
    public static final boolean DEFAULT = true;
    public static final FansClubSuperFanHideSubEmotesSettings INSTANCE = new FansClubSuperFanHideSubEmotesSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_super_fan_hide_sub_emotes", DEFAULT);
    }
}
