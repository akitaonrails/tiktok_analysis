package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_goal_integration")
public final class LiveGoalIntegrationSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGoalIntegrationSetting INSTANCE = new LiveGoalIntegrationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_goal_integration", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
