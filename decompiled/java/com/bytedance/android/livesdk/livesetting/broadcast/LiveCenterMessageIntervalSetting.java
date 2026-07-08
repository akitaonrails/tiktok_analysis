package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_message_interval_setting")
public final class LiveCenterMessageIntervalSetting {
    public static final int DEFAULT = 10;
    public static final LiveCenterMessageIntervalSetting INSTANCE = new LiveCenterMessageIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_center_message_interval_setting", DEFAULT);
    }
}
