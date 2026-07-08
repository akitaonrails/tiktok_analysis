package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_full_screen_survey_ui_adjustment")
public final class LiveFullScreenSurveyUiAdjustment {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveFullScreenSurveyUiAdjustment INSTANCE = new LiveFullScreenSurveyUiAdjustment();

    public static final boolean v2() {
        return SettingsManager.INSTANCE.getBooleanValue("live_full_screen_survey_ui_adjustment", DEFAULT);
    }
}
