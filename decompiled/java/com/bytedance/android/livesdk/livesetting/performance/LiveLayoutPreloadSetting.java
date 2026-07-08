package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_layout_preload")
public final class LiveLayoutPreloadSetting {
    public static final boolean DEFAULT = false;
    public static final LiveLayoutPreloadSetting INSTANCE = new LiveLayoutPreloadSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_layout_preload", DEFAULT);
    }
}
