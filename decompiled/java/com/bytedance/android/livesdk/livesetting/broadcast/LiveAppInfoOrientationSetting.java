package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_app_info_orientation_settings")
public final class LiveAppInfoOrientationSetting {
    public static final boolean DEFAULT = true;
    public static final LiveAppInfoOrientationSetting INSTANCE = new LiveAppInfoOrientationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_app_info_orientation_settings", DEFAULT);
    }
}
