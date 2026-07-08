package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("setting_to_json_opt")
public final class LiveSettingToJsonOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveSettingToJsonOptSetting INSTANCE = new LiveSettingToJsonOptSetting();
    public static int value = -1;

    public static final boolean enableIndexBuilderOutputOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("setting_to_json_opt", DEFAULT);
        }
        return (value & 2) == 2;
    }

    public static final boolean enableSettingToJsonOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("setting_to_json_opt", DEFAULT);
        }
        return (value & 1) == 1;
    }
}
