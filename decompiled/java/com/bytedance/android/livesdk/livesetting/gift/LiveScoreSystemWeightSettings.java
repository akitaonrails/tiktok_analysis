package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_score_system_weights")
public final class LiveScoreSystemWeightSettings {
    public static final LiveScoreSystemWeightSettings INSTANCE = new LiveScoreSystemWeightSettings();
    public static final ScoreWeights DEFAULT = new ScoreWeights();

    public final ScoreWeights getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ScoreWeights scoreWeights = DEFAULT;
        ScoreWeights scoreWeights2 = (ScoreWeights) settingsManager.getValueSafely("live_score_system_weights", scoreWeights);
        return scoreWeights2 != null ? scoreWeights2 : scoreWeights;
    }

    public final ScoreWeights getDEFAULT() {
        return DEFAULT;
    }
}
