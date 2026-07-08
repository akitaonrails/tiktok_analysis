package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("net_monitor_block_list")
public final class NetMonitorBlockListSettings {
    public static final NetMonitorBlockListSettings INSTANCE = new NetMonitorBlockListSettings();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("net_monitor_block_list", DEFAULT);
    }
}
