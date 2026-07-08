package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_goal_enable_suspension")
public final class LiveGoalEnableSuspensionSetting {
    public static final int DEFAULT = 0;
    public static final LiveGoalEnableSuspensionSetting INSTANCE = new LiveGoalEnableSuspensionSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_goal_enable_suspension", DEFAULT) > 0;
    }
}
