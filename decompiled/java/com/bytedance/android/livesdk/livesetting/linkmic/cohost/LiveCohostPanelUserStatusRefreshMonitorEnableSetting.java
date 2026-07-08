package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_panel_user_status_refresh_monitor_enable")
public final class LiveCohostPanelUserStatusRefreshMonitorEnableSetting {
    public static final int DEFAULT = 0;
    public static final LiveCohostPanelUserStatusRefreshMonitorEnableSetting INSTANCE = new LiveCohostPanelUserStatusRefreshMonitorEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_panel_user_status_refresh_monitor_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
