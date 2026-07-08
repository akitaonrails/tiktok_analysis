package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_obs_live_goal_and_guessing_adapt")
public final class TtliveGameObsLiveGoalAndGuessingAdaptSetting {
    public static final boolean DEFAULT = true;
    public static final TtliveGameObsLiveGoalAndGuessingAdaptSetting INSTANCE = new TtliveGameObsLiveGoalAndGuessingAdaptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_obs_live_goal_and_guessing_adapt", DEFAULT);
    }
}
