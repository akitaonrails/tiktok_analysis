package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("light_survey_submit_delay")
public final class LightSurveyDelayConfig {
    public static final long DEFAULT = 800;
    public static final LightSurveyDelayConfig INSTANCE = new LightSurveyDelayConfig();

    public final long delay() {
        return SettingsManager.INSTANCE.getLongValue("light_survey_submit_delay", DEFAULT);
    }
}
