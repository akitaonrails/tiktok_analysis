package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_goal_style")
public final class PreviewRevisionGoalStyleABSetting {
    public static final int DEFAULT = 0;
    public static final PreviewRevisionGoalStyleABSetting INSTANCE = new PreviewRevisionGoalStyleABSetting();

    public final boolean isLiveGoalInBottom() {
        return SettingsManager.INSTANCE.getIntValue("live_goal_style", DEFAULT) == 1;
    }

    public final boolean isLiveGoalInCoverTitle() {
        return SettingsManager.INSTANCE.getIntValue("live_goal_style", DEFAULT) == 2;
    }

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("live_goal_style", DEFAULT) != 0;
    }
}
