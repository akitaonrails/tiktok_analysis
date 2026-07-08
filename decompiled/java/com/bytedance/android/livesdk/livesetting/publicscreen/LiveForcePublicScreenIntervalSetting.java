package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_force_public_screen_interval_setting")
public final class LiveForcePublicScreenIntervalSetting {
    public static final long DEFAULT = 0;
    public static final LiveForcePublicScreenIntervalSetting INSTANCE = new LiveForcePublicScreenIntervalSetting();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_force_public_screen_interval_setting", DEFAULT);
    }
}
