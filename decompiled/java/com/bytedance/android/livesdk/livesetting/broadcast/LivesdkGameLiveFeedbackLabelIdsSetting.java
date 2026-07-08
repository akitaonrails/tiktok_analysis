package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.GameLiveFeedbackLabelIds;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_game_live_feedback_label_ids")
public final class LivesdkGameLiveFeedbackLabelIdsSetting {
    public static final LivesdkGameLiveFeedbackLabelIdsSetting INSTANCE = new LivesdkGameLiveFeedbackLabelIdsSetting();
    public static final GameLiveFeedbackLabelIds DEFAULT = new GameLiveFeedbackLabelIds("7196884519075446785", "71968845215375196181", "71968845215375196183");

    public final GameLiveFeedbackLabelIds getValue() {
        GameLiveFeedbackLabelIds gameLiveFeedbackLabelIds = (GameLiveFeedbackLabelIds) SettingsManager.INSTANCE.getValueSafely(LivesdkGameLiveFeedbackLabelIdsSetting.class);
        return gameLiveFeedbackLabelIds == null ? DEFAULT : gameLiveFeedbackLabelIds;
    }
}
