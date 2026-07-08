package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("ttlive_game_notification_settings")
public final class GameNotificationSetting {
    public static final boolean DEFAULT = false;
    public static final boolean GROUP_EXPERIMENT = true;
    public static final GameNotificationSetting INSTANCE = new GameNotificationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_notification_settings", DEFAULT);
    }
}
