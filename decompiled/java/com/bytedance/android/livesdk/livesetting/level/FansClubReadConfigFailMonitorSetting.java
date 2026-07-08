package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_read_config_fail_monitor_setting")
public final class FansClubReadConfigFailMonitorSetting {
    public static final boolean DEFAULT = false;
    public static final FansClubReadConfigFailMonitorSetting INSTANCE = new FansClubReadConfigFailMonitorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fans_club_read_config_fail_monitor_setting", DEFAULT);
    }
}
