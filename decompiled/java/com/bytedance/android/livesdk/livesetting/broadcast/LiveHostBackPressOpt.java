package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_backpress_opt")
public final class LiveHostBackPressOpt {
    public static final boolean DEFAULT = false;
    public static final LiveHostBackPressOpt INSTANCE = new LiveHostBackPressOpt();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_backpress_opt", DEFAULT);
    }
}
