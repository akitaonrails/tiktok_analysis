package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "remove_survey_after_scrolled")
public final class RemoveSurveyAfterScrolledSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final RemoveSurveyAfterScrolledSetting INSTANCE = new RemoveSurveyAfterScrolledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("remove_survey_after_scrolled", DEFAULT);
    }
}
