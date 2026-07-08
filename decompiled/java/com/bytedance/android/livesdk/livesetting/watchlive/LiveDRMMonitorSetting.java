package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_drm_monitor_setting")
public final class LiveDRMMonitorSetting {
    public static final boolean DISABLE = false;
    public static final LiveDRMMonitorSetting INSTANCE = new LiveDRMMonitorSetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_drm_monitor_setting", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }
}
