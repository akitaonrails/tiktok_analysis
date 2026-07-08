package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_survey_exit_swipe")
public final class LiveInnerSurveyExitSwipe {
    public static final boolean DEFAULT = true;
    public static final LiveInnerSurveyExitSwipe INSTANCE = new LiveInnerSurveyExitSwipe();
    public static final boolean KEEP = false;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inner_survey_exit_swipe", DEFAULT);
    }
}
