package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_host_charge_settings_only_video_type")
public final class LiveHostChargeLiveTypeSettings {
    public static final boolean DEFAULT = false;
    public static final LiveHostChargeLiveTypeSettings INSTANCE = new LiveHostChargeLiveTypeSettings();

    public static final boolean onlyVideoType() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_charge_settings_only_video_type", DEFAULT);
    }
}
