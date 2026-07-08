package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_goal_2_green_screen")
public final class LiveGoal2GreenScreenSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGoal2GreenScreenSetting INSTANCE = new LiveGoal2GreenScreenSetting();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_goal_2_green_screen", DEFAULT);
    }
}
