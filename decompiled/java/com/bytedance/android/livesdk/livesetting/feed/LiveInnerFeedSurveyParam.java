package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_smart_survey_param_req_client")
public final class LiveInnerFeedSurveyParam {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveInnerFeedSurveyParam INSTANCE = new LiveInnerFeedSurveyParam();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_smart_survey_param_req_client", DEFAULT);
    }
}
