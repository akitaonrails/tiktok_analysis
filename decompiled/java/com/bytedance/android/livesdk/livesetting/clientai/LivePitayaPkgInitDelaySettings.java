package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pitaya_pkg_update_init_delay")
public final class LivePitayaPkgInitDelaySettings {
    public static final int DEFAULT = 0;
    public static final LivePitayaPkgInitDelaySettings INSTANCE = new LivePitayaPkgInitDelaySettings();

    public final int delaySeconds() {
        return SettingsManager.INSTANCE.getIntValue("live_pitaya_pkg_update_init_delay", DEFAULT);
    }
}
