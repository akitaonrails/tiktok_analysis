package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_extend_screen_offline")
public final class LiveExtendScreenOfflineSetting {
    public static final boolean DEFAULT = false;
    public static final LiveExtendScreenOfflineSetting INSTANCE = new LiveExtendScreenOfflineSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_extend_screen_offline", DEFAULT);
    }
}
