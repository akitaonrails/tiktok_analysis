package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_preview_full_screen_survey_ui_fix")
public final class LivePreviewFullScreenSurveyUIFix {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LivePreviewFullScreenSurveyUIFix INSTANCE = new LivePreviewFullScreenSurveyUIFix();

    public static final boolean fix() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preview_full_screen_survey_ui_fix", DEFAULT);
    }
}
