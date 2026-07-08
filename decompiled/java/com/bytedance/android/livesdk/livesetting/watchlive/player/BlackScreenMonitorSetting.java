package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("black_screen_monitor_setting")
public final class BlackScreenMonitorSetting {
    public static final BlackScreenMonitorSetting INSTANCE = new BlackScreenMonitorSetting();
    public static final int DEFAULT = 1;
    public static final int ENABLE_ONLINE = 2;
    public static final int ENABLE_ALL_SCENE = 3;

    public final int getEnable() {
        return SettingsManager.INSTANCE.getIntValue("black_screen_monitor_setting", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE_ALL_SCENE() {
        return ENABLE_ALL_SCENE;
    }

    public final int getENABLE_ONLINE() {
        return ENABLE_ONLINE;
    }
}
