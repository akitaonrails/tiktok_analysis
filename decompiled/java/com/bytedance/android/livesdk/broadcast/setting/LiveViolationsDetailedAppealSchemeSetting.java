package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_violations_detailed_appeal_scheme")
public final class LiveViolationsDetailedAppealSchemeSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_treco%2Fpages%2Fpunish-pre-appeal%2Ftemplate.js&hide_loading=1&container_bg_color=ffffff&gravity=bottom&height=60%25&radius=8&transition_animation=bottom";
    public static final LiveViolationsDetailedAppealSchemeSetting INSTANCE = new LiveViolationsDetailedAppealSchemeSetting();

    public static final String getSchema() {
        String value = INSTANCE.getValue();
        return a0.LJJJIL(value) ? "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_treco%2Fpages%2Fpunish-pre-appeal%2Ftemplate.js&hide_loading=1&container_bg_color=ffffff&gravity=bottom&height=60%25&radius=8&transition_animation=bottom" : value;
    }

    private final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_violations_detailed_appeal_scheme", DEFAULT);
    }
}
