package com.bytedance.android.livesdk.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "try_mode_fix_ab")
public final class TryModeFixAbSetting {
    public static final boolean DEFAULT = true;
    public static final TryModeFixAbSetting INSTANCE = new TryModeFixAbSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("try_mode_fix_ab", DEFAULT);
    }
}
