package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("enable_mobile_game_feedback_info_and_diagnose")
public final class EnableMobileGameBroadcastFeedbackInfoAndDiagnose {
    public static final int DEFAULT = 0;
    public static final EnableMobileGameBroadcastFeedbackInfoAndDiagnose INSTANCE = new EnableMobileGameBroadcastFeedbackInfoAndDiagnose();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("enable_mobile_game_feedback_info_and_diagnose", DEFAULT) == 1;
    }
}
