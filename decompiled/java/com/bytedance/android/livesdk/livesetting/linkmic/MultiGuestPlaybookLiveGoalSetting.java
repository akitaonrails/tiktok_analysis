package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_playbook_live_goal_time_out")
public final class MultiGuestPlaybookLiveGoalSetting {
    public static final long DEFAULT = 0;
    public static final MultiGuestPlaybookLiveGoalSetting INSTANCE = new MultiGuestPlaybookLiveGoalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_playbook_live_goal_time_out", DEFAULT);
    }
}
