package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_adjust_follow_guide_strategy")
public final class LiveAdjustFollowGuideStrategySetting {
    public static final boolean DEFAULT = false;
    public static final LiveAdjustFollowGuideStrategySetting INSTANCE = new LiveAdjustFollowGuideStrategySetting();
    public static final boolean V2 = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_adjust_follow_guide_strategy", DEFAULT);
    }
}
