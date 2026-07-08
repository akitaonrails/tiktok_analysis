package com.bytedance.android.livesdk.game.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("mobile_game_feedback_analyse_info")
public final class MobileGameFeedbackAnalyseInfo {
    public static final MobileGameFeedbackAnalyseInfo INSTANCE = new MobileGameFeedbackAnalyseInfo();
    public static final MobileGameBroadcastFeedbackConfig DEFAULT = new MobileGameBroadcastFeedbackConfig(45, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 20, 0.7f, 0.9f, 60, 0.4f, 60, 0.4f, 20, 120, 100, 0.3f, 10, 100, 5);
    public static final int $stable = 8;

    public final MobileGameBroadcastFeedbackConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MobileGameBroadcastFeedbackConfig mobileGameBroadcastFeedbackConfig = DEFAULT;
        MobileGameBroadcastFeedbackConfig mobileGameBroadcastFeedbackConfig2 = (MobileGameBroadcastFeedbackConfig) settingsManager.getValueSafely("mobile_game_feedback_analyse_info", mobileGameBroadcastFeedbackConfig);
        return mobileGameBroadcastFeedbackConfig2 != null ? mobileGameBroadcastFeedbackConfig2 : mobileGameBroadcastFeedbackConfig;
    }
}
