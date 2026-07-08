package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_highlight_goal_gift")
public final class LiveGiftHighlightGoalEnabledSetting {
    public static final LiveGiftHighlightGoalEnabledSetting INSTANCE = new LiveGiftHighlightGoalEnabledSetting();
    public static final LiveGoalSetting DEFAULT = new LiveGoalSetting();

    public final LiveGoalSetting getValue() {
        LiveGoalSetting liveGoalSetting = (LiveGoalSetting) SettingsManager.INSTANCE.getValueSafely(LiveGiftHighlightGoalEnabledSetting.class);
        return liveGoalSetting == null ? DEFAULT : liveGoalSetting;
    }
}
