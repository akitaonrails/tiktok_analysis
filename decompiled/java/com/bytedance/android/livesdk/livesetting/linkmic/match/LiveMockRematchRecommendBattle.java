package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_mock_rematch_recommend_battle")
public final class LiveMockRematchRecommendBattle {
    public static final int DEFAULT = 0;
    public static final LiveMockRematchRecommendBattle INSTANCE = new LiveMockRematchRecommendBattle();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_mock_rematch_recommend_battle", DEFAULT);
    }
}
