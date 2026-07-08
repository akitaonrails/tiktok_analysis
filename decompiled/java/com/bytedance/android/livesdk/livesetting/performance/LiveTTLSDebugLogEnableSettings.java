package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("webcast_live_sdk_ttls_enable_debug_log_settings")
public final class LiveTTLSDebugLogEnableSettings {
    public static final boolean DEFAULT = false;
    public static final LiveTTLSDebugLogEnableSettings INSTANCE = new LiveTTLSDebugLogEnableSettings();

    public final boolean isDebugLogEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("webcast_live_sdk_ttls_enable_debug_log_settings", DEFAULT);
    }
}
