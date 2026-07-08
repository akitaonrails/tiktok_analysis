package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_fans_club_super_fan_emote_auto_position")
public final class FansClubSuperFanEmoteAutoPositionSettings {
    public static final boolean DEFAULT = true;
    public static final FansClubSuperFanEmoteAutoPositionSettings INSTANCE = new FansClubSuperFanEmoteAutoPositionSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_super_fan_emote_auto_position", DEFAULT);
    }
}
