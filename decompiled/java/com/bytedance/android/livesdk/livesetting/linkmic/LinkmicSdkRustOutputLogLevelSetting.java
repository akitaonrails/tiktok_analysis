package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_rust_output_log_level")
public final class LinkmicSdkRustOutputLogLevelSetting {
    public static final int DEBUG = 1;
    public static final int DEFAULT = 2;
    public static final int ERROR = 4;
    public static final LinkmicSdkRustOutputLogLevelSetting INSTANCE = new LinkmicSdkRustOutputLogLevelSetting();
    public static final int VERBOSE = 0;
    public static final int WARN = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_sdk_rust_output_log_level", DEFAULT);
    }
}
