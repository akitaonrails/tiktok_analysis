package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_manual_refresh_enable")
public final class LiveCenterManualRefreshSetting {
    public static final int DEFAULT = 1;
    public static final LiveCenterManualRefreshSetting INSTANCE = new LiveCenterManualRefreshSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_center_manual_refresh_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() > 0;
    }
}
