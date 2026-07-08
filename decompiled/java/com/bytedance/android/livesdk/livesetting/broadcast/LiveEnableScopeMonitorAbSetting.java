package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enable_scope_monitor_ab")
public final class LiveEnableScopeMonitorAbSetting {
    public static final int DEFAULT = 1;
    public static final LiveEnableScopeMonitorAbSetting INSTANCE = new LiveEnableScopeMonitorAbSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_enable_scope_monitor_ab", DEFAULT) == 1;
    }
}
