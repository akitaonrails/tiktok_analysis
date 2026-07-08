package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("net_monitor_allow_list")
public final class NetMonitorAllowListSettings {
    public static final NetMonitorAllowListSettings INSTANCE = new NetMonitorAllowListSettings();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("net_monitor_allow_list", DEFAULT);
    }
}
