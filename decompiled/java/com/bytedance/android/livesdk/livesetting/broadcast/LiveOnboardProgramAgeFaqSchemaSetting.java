package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_onboarding_program_age_faq_popup_schema")
public final class LiveOnboardProgramAgeFaqSchemaSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?hide_nav_bar=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_tools%2Fpages%2Flop-age-faq%2Ftemplate.js&hide_loading=1&height=60%25&use_live_sheet=1&launch_mode=navigate&gravity=bottom&bdhm_bid=tiktok_live_fundamental_live_onboard_program&bdhm_pid=lop-age-faq";
    public static final LiveOnboardProgramAgeFaqSchemaSetting INSTANCE = new LiveOnboardProgramAgeFaqSchemaSetting();

    public final String schema() {
        return SettingsManager.INSTANCE.getStringValue("live_onboarding_program_age_faq_popup_schema", DEFAULT);
    }
}
