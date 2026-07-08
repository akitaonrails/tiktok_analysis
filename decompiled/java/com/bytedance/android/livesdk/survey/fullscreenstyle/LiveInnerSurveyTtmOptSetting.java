package com.bytedance.android.livesdk.survey.fullscreenstyle;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_survey_ttm_opt")
public final class LiveInnerSurveyTtmOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveInnerSurveyTtmOptSetting INSTANCE = new LiveInnerSurveyTtmOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inner_survey_ttm_opt", DEFAULT);
    }
}
