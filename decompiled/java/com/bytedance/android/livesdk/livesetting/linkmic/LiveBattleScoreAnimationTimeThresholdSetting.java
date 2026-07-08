package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_battle_score_animation_time_threshold")
public final class LiveBattleScoreAnimationTimeThresholdSetting {
    public static final long DEFAULT = 10;
    public static final LiveBattleScoreAnimationTimeThresholdSetting INSTANCE = new LiveBattleScoreAnimationTimeThresholdSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_battle_score_animation_time_threshold", DEFAULT);
    }
}
