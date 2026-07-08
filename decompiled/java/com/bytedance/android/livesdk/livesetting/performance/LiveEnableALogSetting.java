package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_enable_alog")
public final class LiveEnableALogSetting {
    public static final LiveEnableALogSetting INSTANCE = new LiveEnableALogSetting();
    public static final boolean DEFAULT = true;
    public static boolean value = SettingsManager.INSTANCE.getBooleanValue("live_enable_alog", DEFAULT);

    public final void update() {
        value = SettingsManager.INSTANCE.getBooleanValue("live_enable_alog", DEFAULT);
    }

    public final boolean isDisable() {
        return !isEnable();
    }

    public final boolean isEnable() {
        return value;
    }
}
