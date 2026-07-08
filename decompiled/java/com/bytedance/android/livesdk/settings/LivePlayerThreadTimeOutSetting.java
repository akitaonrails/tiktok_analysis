package com.bytedance.android.livesdk.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_player_thread_timeout_setting")
public final class LivePlayerThreadTimeOutSetting {
    public static final int DEFAULT = -1;
    public static final LivePlayerThreadTimeOutSetting INSTANCE = new LivePlayerThreadTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_player_thread_timeout_setting", DEFAULT);
    }

    public final boolean isDisable() {
        return getValue() < 0;
    }
}
