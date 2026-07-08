package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_multiguest_follow_guide_strategy")
public final class LinkmicMultiguestFollowGuideStrategySetting {
    public static final int DEFAULT = 0;
    public static final LinkmicMultiguestFollowGuideStrategySetting INSTANCE = new LinkmicMultiguestFollowGuideStrategySetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_multiguest_follow_guide_strategy", DEFAULT) != 0;
    }
}
