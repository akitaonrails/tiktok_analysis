package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_native_log")
public final class TTLHEnableNativeLog {
    public static final boolean DEFAULT = false;
    public static final TTLHEnableNativeLog INSTANCE = new TTLHEnableNativeLog();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_enable_native_log", DEFAULT);
    }
}
