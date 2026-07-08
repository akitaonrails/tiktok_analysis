package com.bytedance.android.livesdk.survey.util;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_open_survey_fc_group_spit")
public final class LiveOpenSurveyFcGroupSpitSetting {
    public static final boolean DEFAULT = false;
    public static final LiveOpenSurveyFcGroupSpitSetting INSTANCE = new LiveOpenSurveyFcGroupSpitSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_open_survey_fc_group_spit", DEFAULT);
    }
}
