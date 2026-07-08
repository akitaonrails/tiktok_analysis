package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_message_interval_for_game_setting")
public final class LiveCenterMessageIntervalForGameSetting {
    public static final int DEFAULT = 1;
    public static final LiveCenterMessageIntervalForGameSetting INSTANCE = new LiveCenterMessageIntervalForGameSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_center_message_interval_for_game_setting", DEFAULT);
    }
}
