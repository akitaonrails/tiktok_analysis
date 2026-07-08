package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "hangout_toplive_crash_fix")
public final class HangoutTopliveCrashFixSetting {
    public static final int DEFAULT = 1;
    public static final HangoutTopliveCrashFixSetting INSTANCE = new HangoutTopliveCrashFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("hangout_toplive_crash_fix", DEFAULT);
    }

    public final boolean isFix() {
        return getValue() == 1;
    }
}
