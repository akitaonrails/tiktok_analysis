package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_host_settings_ui_config")
public final class LiveHostSettingsUIConfig {
    public static final LiveHostSettingsUIConfig INSTANCE = new LiveHostSettingsUIConfig();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_host_settings_ui_config", DEFAULT);

    public static final boolean v1() {
        return value == 1;
    }

    public static final boolean v2() {
        return value == 2;
    }

    public static final boolean enable() {
        return v1() || v2();
    }
}
