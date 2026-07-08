package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_speed_test_fix_setting")
public final class AnchorSpeedTestFixSetting {
    public static final int DEFAULT = 1;
    public static final AnchorSpeedTestFixSetting INSTANCE = new AnchorSpeedTestFixSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_speed_test_fix_setting", DEFAULT) == 1;
    }
}
